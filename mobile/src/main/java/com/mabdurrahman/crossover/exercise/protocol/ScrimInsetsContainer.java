/*
 * Copyright (c) Mahmoud Abdurrahman 2017. All Rights Reserved.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mabdurrahman.crossover.exercise.protocol;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;

/**
 * Created by Mahmoud Abdurrahman (ma.abdurrahman@gmail.com) on 1/18/17.
 */
public interface ScrimInsetsContainer {

    void setInsetForegroundColor(@ColorInt int color);

    void setInsetForeground(Drawable insetForeground);

    Drawable getInsetForeground();

    void setOnInsetsCallback(OnInsetsCallback onInsetsCallback);

    /**
     * Allows the calling container to specify a callback for custom processing when insets change (i.e. when
     * fitSystemWindows(Rect) is called. This is useful for setting padding on UI elements based on
     * UI chrome insets (e.g. a Google Map or a ListView). When using with ListView or GridView, remember to set
     * clipToPadding to false.
     */
    interface OnInsetsCallback {
        void onInsetsChanged(Rect insets);
    }
}
