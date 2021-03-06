/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
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

package com.ait.lienzo.client.widget.panel;

import com.ait.lienzo.client.core.shape.Layer;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.ProvidesResize;
import com.google.gwt.user.client.ui.RequiresResize;

public abstract class LienzoPanel<P extends LienzoPanel>
        extends FocusPanel
        implements RequiresResize,
                   ProvidesResize
{
    public abstract P add(Layer layer);

    public abstract P setBackgroundLayer(Layer layer);

    public abstract P setCursor(Style.Cursor cursor);

    public abstract int getWidthPx();

    public abstract int getHeightPx();

    public abstract void destroy();
}
