package org.kitty.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageBean;

@HippoEssentialsGenerated(internalName = "kittyshippoproject:imageset")
@Node(jcrType = "kittyshippoproject:imageset")
public class Imageset extends HippoGalleryImageSet {
	@HippoEssentialsGenerated(internalName = "kittyshippoproject:small")
	public HippoGalleryImageBean getSmall() {
		return getBean("kittyshippoproject:small", HippoGalleryImageBean.class);
	}

	@HippoEssentialsGenerated(internalName = "kittyshippoproject:large")
	public HippoGalleryImageBean getLarge() {
		return getBean("kittyshippoproject:large", HippoGalleryImageBean.class);
	}

	@HippoEssentialsGenerated(internalName = "kittyshippoproject:smallsquare")
	public HippoGalleryImageBean getSmallsquare() {
		return getBean("kittyshippoproject:smallsquare",
				HippoGalleryImageBean.class);
	}

	@HippoEssentialsGenerated(internalName = "kittyshippoproject:mediumsquare")
	public HippoGalleryImageBean getMediumsquare() {
		return getBean("kittyshippoproject:mediumsquare",
				HippoGalleryImageBean.class);
	}

	@HippoEssentialsGenerated(internalName = "kittyshippoproject:largesquare")
	public HippoGalleryImageBean getLargesquare() {
		return getBean("kittyshippoproject:largesquare",
				HippoGalleryImageBean.class);
	}

	@HippoEssentialsGenerated(internalName = "kittyshippoproject:banner")
	public HippoGalleryImageBean getBanner() {
		return getBean("kittyshippoproject:banner", HippoGalleryImageBean.class);
	}
}
