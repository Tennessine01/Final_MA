package vn.edu.usth.library2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;


public class ViewPagerAdapter extends FragmentStateAdapter{

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Home_fragment();
            case 1:
                return new Search_fragment();
            case 2:
                return new Mylibrary_fragment();
            case 3:
                return new Account_fragment();
            default:
                return new Home_fragment();
            }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}


//    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
//        super(fragmentActivity);
//    }
//
//    @NonNull
//    @Override
//    public Fragment createFragment(int position) {
//        switch (position) {
//            case 0:
//                return new Home_fragment();
//            case 1:
//                return new Search_fragment();
//            case 2:
//                return new Mylibrary_fragment();
//            case 3:
//                return new Account_fragment();
//            default:
//                return new Home_fragment();
//            }
//    }
//
//
//    @Override
//    public int getItemCount() {
//        return 4;
//    }
//}
