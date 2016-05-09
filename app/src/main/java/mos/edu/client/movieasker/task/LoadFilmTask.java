package mos.edu.client.movieasker.task;

import android.os.AsyncTask;

import junit.framework.Assert;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import mos.edu.client.movieasker.activity.FilmActivity;
import mos.edu.client.movieasker.activity.dialog.DialogManager;
import mos.edu.client.movieasker.app.Constants;
import mos.edu.client.movieasker.app.ThisApplication;
import mos.edu.client.movieasker.dto.FilmDTO;

public class LoadFilmTask extends AsyncTask<Integer, Void, FilmDTO> {

    private FilmActivity activity;

    public LoadFilmTask(FilmActivity activity) {
        attachActivity(activity);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        activity.showLoadingProgressBar(true);
    }

    @Override
    protected FilmDTO doInBackground(Integer... params) {
        Assert.assertTrue("Params must be 1: filmId", params.length == 1);

        final RestTemplate template = ThisApplication.getInstance().getRestTemplate();
        ResponseEntity<FilmDTO> response;
        try {
            response = template.getForEntity(Constants.URI.FILM_BY_ID, FilmDTO.class, (Object[]) params);
        } catch (RestClientException e) {
            return null;
        }

        return response.getBody();
    }

    @Override
    protected void onPostExecute(FilmDTO film) {
        if (film == null) {
            DialogManager.showDialog(activity, DialogManager.BAD_INTERNET_CONNECTION);
            activity.finish();
        } else {
            activity.bindViewFilm(film);
            activity.showLoadingProgressBar(false);
        }

        activity = null;
        super.onPostExecute(film);
    }

    public void attachActivity(FilmActivity activity) {
        this.activity = activity;
    }

}