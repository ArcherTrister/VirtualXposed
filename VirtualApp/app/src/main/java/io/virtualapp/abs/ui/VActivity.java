package io.virtualapp.abs.ui;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import org.jdeferred.android.AndroidDeferredManager;

import io.virtualapp.abs.BaseView;

/**
 * @author Lody
 */
public class VActivity extends AppCompatActivity { //Activity {

    /**
     * Implement of {@link BaseView#getActivity()}
     */
    public Activity getActivity() {
        return this;
    }

    /**
     * Implement of {@link BaseView#getContext()} ()}
     */
    public Context getContext() {
        return this;
    }

    protected AndroidDeferredManager defer() {
        return VUiKit.defer();
    }

//    public Fragment findFragmentById(@IdRes int id) {
//        return getFragmentManager().findFragmentById(id);
//    }
//
//    public void replaceFragment(@IdRes int id, Fragment fragment) {
//        getFragmentManager().beginTransaction().replace(id, fragment).commit();
//    }

    public Fragment findFragmentById(@IdRes int id) {
        return getSupportFragmentManager().findFragmentById(id);
    }

    // 替换 Fragment
    public void replaceFragment(@IdRes int id, Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(id, fragment)
                .addToBackStack(null) // 可选：加入返回栈
                .commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
