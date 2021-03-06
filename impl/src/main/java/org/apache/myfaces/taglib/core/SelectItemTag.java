/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.myfaces.taglib.core;

import org.apache.myfaces.renderkit.html.util.JSFAttr;

import javax.el.ValueExpression;
import javax.faces.component.UIComponent;

public class SelectItemTag
    extends org.apache.myfaces.taglib.core.UIComponentELTagBase
{

    @Override
    public String getComponentType()
    {
        return "javax.faces.SelectItem";
    }

    @Override
    public String getRendererType()
    {
        return null;
    }

    // UISelectItem attributes
    private ValueExpression _itemDisabled;
    private ValueExpression _itemDescription;
    private ValueExpression _itemLabel;
    private ValueExpression _itemValue;
    private ValueExpression _escape;
    private ValueExpression _noSelectionOption;

    @Override
    protected void setProperties(UIComponent component)
    {
        super.setProperties(component);

        setBooleanProperty(component, JSFAttr.ITEM_DISABLED_ATTR, _itemDisabled);
        setStringProperty(component, JSFAttr.ITEM_DESCRIPTION_ATTR, _itemDescription);
        setStringProperty(component, JSFAttr.ITEM_LABEL_ATTR, _itemLabel);
        setStringProperty(component, JSFAttr.ITEM_VALUE_ATTR, _itemValue);
        setBooleanProperty(component, JSFAttr.ITEM_ESCAPED_ATTR, _escape, Boolean.TRUE);
        setBooleanProperty(component, JSFAttr.NO_SELECTION_OPTION_ATTR, _noSelectionOption, Boolean.FALSE);
    }

    public void setItemDisabled(ValueExpression itemDisabled)
    {
        _itemDisabled = itemDisabled;
    }

    public void setItemDescription(ValueExpression itemDescription)
    {
        _itemDescription = itemDescription;
    }

    public void setItemLabel(ValueExpression itemLabel)
    {
        _itemLabel = itemLabel;
    }

    public void setItemValue(ValueExpression itemValue)
    {
        _itemValue = itemValue;
    }

    public void setEscape(ValueExpression escape)
    {
        _escape = escape;
    }

    protected ValueExpression getItemValue()
    {
        return _itemValue;
    }

    public void setNoSelectionOption(ValueExpression noSelectionOption)
    {
        _noSelectionOption = noSelectionOption;
    }

}
