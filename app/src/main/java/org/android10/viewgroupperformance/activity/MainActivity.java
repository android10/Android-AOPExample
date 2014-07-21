package org.android10.viewgroupperformance.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import org.android10.viewgroupperformance.R;

public class MainActivity extends Activity {

  private Button btnRelativeLayoutTest;
  private Button btnLinearLayoutTest;
  private Button btnFrameLayoutTest;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mapGUI();
  }

  /**
   * Maps Graphical User Interface
   */
  private void mapGUI() {
    this.btnRelativeLayoutTest = (Button) findViewById(R.id.btnRelativeLayout);
    this.btnRelativeLayoutTest.setOnClickListener(btnRelativeLayoutOnClickListener);

    this.btnLinearLayoutTest = (Button) findViewById(R.id.btnLinearLayout);
    this.btnLinearLayoutTest.setOnClickListener(btnLinearLayoutOnClickListener);

    this.btnFrameLayoutTest = (Button) findViewById(R.id.btnFrameLayout);
    this.btnFrameLayoutTest.setOnClickListener(btnFrameLayoutOnClickListener);
  }

  private View.OnClickListener btnRelativeLayoutOnClickListener = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      openActivity(RelativeLayoutTestActivity.class);
    }
  };

  private View.OnClickListener btnLinearLayoutOnClickListener = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      openActivity(LinearLayoutTestActivity.class);
    }
  };

  private View.OnClickListener btnFrameLayoutOnClickListener = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      openActivity(FrameLayoutTestActivity.class);
    }
  };

  /**
   * Open and activity
   */
  private void openActivity(Class activityToOpen) {
    Intent intent = new Intent(this, activityToOpen);
    startActivity(intent);
  }
}
