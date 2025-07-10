/*
 * @ (#) SlugifyUtil.java 1.0 7/11/2025
 *
 * Copyright (c) 2025 IUH.All rights reserved
 */

package se.benhvien1a.util;

/*
 * @description
 * @author : Nguyen Truong An
 * @date : 7/11/2025
 * @version 1.0
 */

public class SlugifyUtil {
    public static String slugify(String text) {
        return text.toLowerCase()
                .replaceAll("[^a-z0-9\\s-]", "")
                .replaceAll("\\s+", "-")
                .trim();
    }
}