package org.adrianvictor.geleia.activities;

import android.os.Bundle;
import android.view.View;

import org.adrianvictor.geleia.R;
import org.adrianvictor.geleia.activities.base.AbsThemeActivity;
import org.adrianvictor.geleia.util.NavigationUtil;

public class UnreachableActivity extends AbsThemeActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_unreachable);
    }

    public void onSelectClick(View view) {
        NavigationUtil.startSelect(this);
    }
}
