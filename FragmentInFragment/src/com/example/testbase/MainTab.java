package com.example.testbase;

import com.example.testbase.fragment.FragmentHome;
import com.example.testbase.fragment.FragmentMessage;
import com.example.testbase.fragment.FragmentMy;

import com.example.testbase.fragment3.R;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

public class MainTab extends FragmentActivity {
	private String TAG = MainTab.class.getName();

	public TabFragmentHost mTabHost;
	// ��ǩ
	private String[] TabTag = { "tab1", "tab2", "tab3" };
	// �Զ���tab������ʾ�ı��Ͷ�����ͼƬ
	private Integer[] ImgTab = { R.layout.tab_main_home,
			R.layout.tab_main_message, R.layout.tab_main_my };

	// tab ѡ�е�activity
	private Class[] ClassTab = { FragmentHome.class, FragmentMessage.class,
			FragmentMy.class };

	// tabѡ�б��� drawable ��ʽͼƬ ��������ͬһ��,������ɫ���� ��ɫ������
	private Integer[] StyleTab = { R.color.white, R.color.white, R.color.white,
			R.color.white };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.maintabs);
		setupView();
		initValue();
		setLinstener();
		fillData();

	}

	private void setupView() {

		// ʵ����framentTabHost
		mTabHost = (TabFragmentHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(),
				android.R.id.tabcontent);

	}

	private void initValue() {

		// ��ʼ��tabѡ�
		InitTabView();
	}

	private void setLinstener() {
		// imv_back.setOnClickListener(this);

	}

	private void fillData() {
		// TODO Auto-generated method stub

	}

	// ��ʼ�� tab �Զ����ѡ� ///////////////
	private void InitTabView() {

		// ���Դ��ݲ��� b;���ݹ�����userid,version,sid
		Bundle b = new Bundle();
		// ѭ�������Զ����tab
		for (int i = 0; i < TabTag.length; i++) {
			// ��װ���Զ����tab����ʽ
			View indicator = getIndicatorView(i);
			mTabHost.addTab(
					mTabHost.newTabSpec(TabTag[i]).setIndicator(indicator),
					ClassTab[i], b);// ���ݹ�������

		}
		mTabHost.getTabWidget().setDividerDrawable(R.color.white);
	}

	// ����tab�Զ�����ʽ:ע�� ÿһ��tab xml�Ӳ��ֵ�linearlayout ��id����һ��
	private View getIndicatorView(int i) {
		// �ҵ�tabhost����tab�Ĳ�����ͼ
		View v = getLayoutInflater().inflate(ImgTab[i], null);
		LinearLayout tv_lay = (LinearLayout) v.findViewById(R.id.layout_back);
		tv_lay.setBackgroundResource(StyleTab[i]);

		return v;
	}
}
