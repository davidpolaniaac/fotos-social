package website.davidpolania.android.photofeed.domain;

import com.firebase.client.FirebaseError;

/**
 * Created by DavidPolania.
 */
public interface FirebaseActionListenerCallback {
    void onSuccess();
    void onError(FirebaseError error);
}
