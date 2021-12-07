package in.evolgrocery.ui.base;

public abstract class BaseFragment {

    public interface CallBack {
        void onFragmentAttached();

        void onFragmentDetached();
    }
}
