/*
 * Copyright (C) 2016 Brian Wernick,
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.devbrackets.android.exomedia.core.listener;

import com.devbrackets.android.exomedia.core.PlaybackState;
import com.devbrackets.android.exomedia.core.exoplayer.EMExoPlayer;
import com.devbrackets.android.exomedia.listener.OnSeekCompletionListener;

/**
 * A listener for core EMExoPlayer events
 */
public interface ExoPlayerListener extends OnSeekCompletionListener {
    void onStateChanged(boolean playWhenReady, @PlaybackState int playbackState);

    void onError(EMExoPlayer emExoPlayer, Exception e);

    void onVideoSizeChanged(int width, int height, int unAppliedRotationDegrees, float pixelWidthHeightRatio);
}
