/*
 * BlockMIUI
 * Copyright (C) 2022 fkj@fkj233.cn
 * https://github.com/577fkj/BlockMIUI
 *
 * This software is free opensource software: you can redistribute it
 * and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either
 * version 3 of the License, or any later version and our eula as published
 * by 577fkj.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * and eula along with this software.  If not, see
 * <https://www.gnu.org/licenses/>
 * <https://github.com/577fkj/BlockMIUI/blob/main/LICENSE>.
 */

package cn.fkj233.ui.activity

import android.app.UiModeManager
import android.content.Context
import android.content.res.Configuration
import android.util.TypedValue
import android.view.Display
import android.view.WindowManager





fun dp2px(context: Context, dpValue: Float): Int =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpValue, context.resources.displayMetrics).toInt()

fun getDispaly(context: Context): Display? {
    return (context.applicationContext.getSystemService(Context.WINDOW_SERVICE) as WindowManager).defaultDisplay
}