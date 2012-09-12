package com.wallpaper.core.com.koushikdutta.urlimageviewhelper;

import android.graphics.drawable.Drawable;

public final class UrlImageCache extends
		SoftReferenceHashTable<String, Drawable> implements UrlImageHashTable {
	private static UrlImageCache mInstance = new UrlImageCache();

	public static UrlImageCache getInstance() {
		return mInstance;
	}

	private UrlImageCache() {
	}
}