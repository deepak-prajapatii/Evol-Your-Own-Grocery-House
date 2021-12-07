package in.evolgrocery.ui.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;

/**
 * Created by deepakPrajapati on 10/07/21.
 */

public abstract class BaseFragment<T extends ViewDataBinding, V extends BaseViewModel> extends Fragment {

    private BaseActivity mBaseActivity;
    private View mRootView;
    private T mViewDataBinding;


    /**
     * Override for set Binding Variable
     *
     * @return id
     */
    public abstract int getBindingVariable();

    /**
     * @return layout resource id
     */
    public abstract
    @LayoutRes
    int getLayoutId();

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public BaseActivity getBaseActivity() {
        return mBaseActivity;
    }

    public T getViewDataBinding() {
        return mViewDataBinding;
    }

    public void hideKeyboard() {
        if (mBaseActivity != null) {
            mBaseActivity.hideKeyboard();
        }
    }


    public boolean isNetworkConnected() {
        return mBaseActivity != null && mBaseActivity.isNetworkConnected();
    }

    public void openActivityOnTokenExpire() {
        if (mBaseActivity != null) {
            mBaseActivity.openActivityOnTokenExpire();
        }
    }

    public interface CallBack {
        void onFragmentAttached();

        void onFragmentDetached();
    }
}
