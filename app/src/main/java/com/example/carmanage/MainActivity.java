package com.example.carmanage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.carmanage.fragment.BCMFragment;
import com.example.carmanage.fragment.MaintainFragment;
import com.example.carmanage.fragment.MineFragment;
import com.example.carmanage.fragment.SalePriceFragment;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private RadioGroup radioGroup;
    private RadioButton rbSalePrice, rbBCM, rbMaintain, rbMine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        radioGroup = findViewById(R.id.radioGroup);
        rbSalePrice = findViewById(R.id.rb_sale_price);
        rbBCM = findViewById(R.id.rb_bcm);
        rbMaintain = findViewById(R.id.rb_maintain);
        rbMine = findViewById(R.id.rb_mine);

        //RadioGroup选中状态改变监听
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_sale_price:
                        /**
                         * setCurrentItem第二个参数控制页面切换动画
                         * true:打开/false:关闭
                         */
                        viewPager.setCurrentItem(0, false);
                        break;
                    case R.id.rb_bcm:
                        viewPager.setCurrentItem(1, false);
                        break;
                    case R.id.rb_maintain:
                        viewPager.setCurrentItem(2, false);
                        break;
                    case R.id.rb_mine:
                        viewPager.setCurrentItem(3, false);
                        break;
                }
            }
        });


        /**
         * ViewPager部分
         */
        viewPager = findViewById(R.id.viewPager);
        SalePriceFragment weChatFragment = new SalePriceFragment();
        BCMFragment contactsFragment = new BCMFragment();
        MaintainFragment discoveryFragment = new MaintainFragment();
        MineFragment meFragment = new MineFragment();
        List<Fragment> alFragment = new ArrayList<Fragment>();
        alFragment.add(weChatFragment);
        alFragment.add(contactsFragment);
        alFragment.add(discoveryFragment);
        alFragment.add(meFragment);
        //ViewPager设置适配器
        viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(), alFragment));
        //ViewPager显示第一个Fragment
        viewPager.setCurrentItem(0);
        //ViewPager页面切换监听
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        radioGroup.check(R.id.rb_sale_price);
                        break;
                    case 1:
                        radioGroup.check(R.id.rb_bcm);
                        break;
                    case 2:
                        radioGroup.check(R.id.rb_maintain);
                        break;
                    case 3:
                        radioGroup.check(R.id.rb_mine);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}
