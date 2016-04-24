/*
 * Copyright (C) 2016 Adrián Medraño Calvo
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA
 * 02111-1307, USA.
 *
 * Written by:
 *     Adrián Medraño Calvo <amcalvo@medranocalvo.com>
 */

/*
 * Kawa base plugin.
 */
package com.medranocalvo.gradle.kawa

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Base kawa plugin.
 *
 * Extends the project with a KawaExtension block.
 */
class KawaBasePlugin implements Plugin<Project> {
    private static final String KAWA_EXTENSION_NAME = "kawa"
    @Override
    void apply(Project project) {
        // Add top-level configuration extension object.
        project.extensions.create(KAWA_EXTENSION_NAME, KawaOptions)
    }
}