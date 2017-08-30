package controllers;

import javax.inject.Inject;
import play.cache.SyncCacheApi;
import play.mvc.*;

public class HomeController extends Controller {
    private SyncCacheApi syncCacheApi;

    @Inject
    public HomeController(SyncCacheApi syncCacheApi) {
        this.syncCacheApi = syncCacheApi;
    }

    public Result doGet() {
        syncCacheApi.get("abc");
        return ok("ok GET");
    }

    public Result doPost() {
        syncCacheApi.get("abc");
        return ok("ok POST");
    }
}
