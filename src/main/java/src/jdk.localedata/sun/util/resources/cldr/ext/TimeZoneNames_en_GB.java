/*
 * Copyright (c) 2012, 2023, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (C) 1991-2016 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in 
 * http://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that
 * (a) this copyright and permission notice appear with all copies 
 * of the Data Files or Software,
 * (b) this copyright and permission notice appear in associated 
 * documentation, and
 * (c) there is clear notice in each modified Data File or in the Software
 * as well as in the documentation associated with the Data File(s) or
 * Software that the data or software has been modified.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.util.resources.cldr.ext;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_en_GB extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] EMPTY_ZONE = new String[] {
               "",
               "",
               "",
               "",
               "",
               "",
            };
        final String[] Europe_Western = new String[] {
               "Western European Standard Time",
               "WET",
               "Western European Summer Time",
               "WEST",
               "Western European Time",
               "WET",
            };
        final String[] Europe_Eastern = new String[] {
               "Eastern European Standard Time",
               "EET",
               "Eastern European Summer Time",
               "EEST",
               "Eastern European Time",
               "EET",
            };
        final String[] Europe_Central = new String[] {
               "Central European Standard Time",
               "CET",
               "Central European Summer Time",
               "CEST",
               "Central European Time",
               "CET",
            };
        final String[] Pierre_Miquelon = new String[] {
               "St Pierre & Miquelon Standard Time",
               "",
               "St Pierre & Miquelon Daylight Time",
               "",
               "St Pierre & Miquelon Time",
               "",
            };
        final String[] Kyrgystan = new String[] {
               "Kyrgystan Time",
               "",
               "",
               "",
               "",
               "",
            };
        final String[] Australia_Central = new String[] {
               "Australian Central Standard Time",
               "",
               "Australian Central Daylight Time",
               "",
               "Central Australia Time",
               "",
            };
        final String[] Mongolia = new String[] {
               "Ulan Bator Standard Time",
               "",
               "Ulan Bator Summer Time",
               "",
               "Ulan Bator Time",
               "",
            };
        final Object[][] data = new Object[][] {
            { "Europe/Paris", Europe_Central },
            { "Africa/Casablanca", Europe_Western },
            { "Europe/Bucharest", Europe_Eastern },
            { "UTC", EMPTY_ZONE },
            { "Europe/Ljubljana", Europe_Central },
            { "timezone.excity.Atlantic/St_Helena", "St Helena" },
            { "Asia/Nicosia", Europe_Eastern },
            { "Europe/Kaliningrad", Europe_Eastern },
            { "Europe/Berlin", Europe_Central },
            { "Africa/El_Aaiun", Europe_Western },
            { "Africa/Cairo", Europe_Eastern },
            { "Europe/Lisbon", Europe_Western },
            { "Europe/Oslo", Europe_Central },
            { "Asia/Gaza", Europe_Eastern },
            { "Europe/Chisinau", Europe_Eastern },
            { "Europe/London",
                new String[] {
                    "",
                    "",
                    "British Summer Time",
                    "BST",
                    "",
                    "",
                }
            },
            { "Australia/Darwin", Australia_Central },
            { "Atlantic/Faeroe", Europe_Western },
            { "Asia/Ulaanbaatar", Mongolia },
            { "Europe/Stockholm", Europe_Central },
            { "Europe/Budapest", Europe_Central },
            { "Atlantic/Canary", Europe_Western },
            { "Europe/Bratislava", Europe_Central },
            { "Europe/San_Marino", Europe_Central },
            { "Europe/Zagreb", Europe_Central },
            { "Europe/Copenhagen", Europe_Central },
            { "Europe/Malta", Europe_Central },
            { "Europe/Helsinki", Europe_Eastern },
            { "timezone.excity.Asia/Rangoon", "Rangoon" },
            { "Asia/Beirut", Europe_Eastern },
            { "Europe/Brussels", Europe_Central },
            { "Europe/Vienna", Europe_Central },
            { "Europe/Busingen", Europe_Central },
            { "Europe/Warsaw", Europe_Central },
            { "Europe/Tallinn", Europe_Eastern },
            { "Europe/Skopje", Europe_Central },
            { "Europe/Podgorica", Europe_Central },
            { "Asia/Damascus", Europe_Eastern },
            { "timezone.excity.America/St_Vincent", "St Vincent" },
            { "Europe/Sarajevo", Europe_Central },
            { "Europe/Tirane", Europe_Central },
            { "America/Miquelon", Pierre_Miquelon },
            { "Europe/Luxembourg", Europe_Central },
            { "timezone.excity.America/St_Lucia", "St Lucia" },
            { "Europe/Belgrade", Europe_Central },
            { "Arctic/Longyearbyen", Europe_Central },
            { "Australia/Broken_Hill", Australia_Central },
            { "Europe/Riga", Europe_Eastern },
            { "Europe/Kiev", Europe_Eastern },
            { "Europe/Rome", Europe_Central },
            { "Asia/Hebron", Europe_Eastern },
            { "ART", Europe_Eastern },
            { "Europe/Belfast",
                new String[] {
                    "",
                    "",
                    "British Summer Time",
                    "BST",
                    "",
                    "",
                }
            },
            { "Europe/Zaporozhye", Europe_Eastern },
            { "timezone.excity.America/St_Johns", "St John\u2019s" },
            { "Atlantic/Jan_Mayen", Europe_Central },
            { "timezone.excity.America/St_Barthelemy", "St Barth\u00e9lemy" },
            { "timezone.excity.America/St_Kitts", "St Kitts" },
            { "Africa/Ceuta", Europe_Central },
            { "Africa/Algiers", Europe_Central },
            { "Europe/Mariehamn", Europe_Eastern },
            { "Europe/Zurich", Europe_Central },
            { "Europe/Vilnius", Europe_Eastern },
            { "Europe/Amsterdam", Europe_Central },
            { "Atlantic/Madeira", Europe_Western },
            { "Europe/Vatican", Europe_Central },
            { "Europe/Gibraltar", Europe_Central },
            { "Asia/Amman", Europe_Eastern },
            { "Australia/Adelaide", Australia_Central },
            { "Europe/Madrid", Europe_Central },
            { "Europe/Uzhgorod", Europe_Eastern },
            { "Europe/Vaduz", Europe_Central },
            { "Europe/Sofia", Europe_Eastern },
            { "timezone.excity.America/St_Thomas", "St Thomas" },
            { "Europe/Prague", Europe_Central },
            { "ACT", Australia_Central },
            { "ECT", Europe_Central },
            { "Africa/Tunis", Europe_Central },
            { "Asia/Bishkek", Kyrgystan },
            { "Europe/Athens", Europe_Eastern },
            { "Europe/Andorra", Europe_Central },
            { "Africa/Tripoli", Europe_Eastern },
            { "timezone.excity.Pacific/Honolulu", "Honolulu" },
            { "Europe/Monaco", Europe_Central },
        };
        return data;
    }
}
