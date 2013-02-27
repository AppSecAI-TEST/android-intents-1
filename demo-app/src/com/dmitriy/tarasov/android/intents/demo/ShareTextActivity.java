/*
 * Copyright 2013 Dmitriy Tarasov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dmitriy.tarasov.android.intents.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.dmitriy.tarasov.android.intents.IntentUtils;

/**
 * @author Dmitriy Tarasov
 */
public class ShareTextActivity extends Activity {

    private EditText subject;
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_text);

        subject = (EditText) findViewById(R.id.subject);
        text = (EditText) findViewById(R.id.text);
    }

    public void shareTextClick(View view) {
        Intent intent = IntentUtils.shareText(subject.getText().toString(), text.getText().toString());
        startActivity(intent);
    }
}
