// Copyright 2014 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package com.flutter.gradle

import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

class IntentFilterCheck {
    // TODO(gmackall): Identify which of these can be val instead of var.
    var hasAutoVerify = false
    var hasActionView = false
    var hasDefaultCategory = false
    var hasBrowsableCategory = false

    fun toJson(): JsonObject =
        buildJsonObject {
            put("hasAutoVerify", hasAutoVerify)
            put("hasActionView", hasActionView)
            put("hasDefaultCategory", hasDefaultCategory)
            put("hasBrowsableCategory", hasBrowsableCategory)
        }
}
