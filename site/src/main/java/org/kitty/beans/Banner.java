package org.kitty.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.kitty.beans.Imageset;

@HippoEssentialsGenerated(internalName = "kittyshippoproject:bannerdocument")
@Node(jcrType = "kittyshippoproject:bannerdocument")
public class Banner extends BaseDocument {
	@HippoEssentialsGenerated(internalName = "kittyshippoproject:title")
	public String getTitle() {
		return getProperty("kittyshippoproject:title");
	}

	@HippoEssentialsGenerated(internalName = "kittyshippoproject:content")
	public HippoHtml getContent() {
		return getHippoHtml("kittyshippoproject:content");
	}

	@HippoEssentialsGenerated(internalName = "kittyshippoproject:link")
	public HippoBean getLink() {
		return getLinkedBean("kittyshippoproject:link", HippoBean.class);
	}

	@HippoEssentialsGenerated(internalName = "kittyshippoproject:image")
	public Imageset getImage() {
		return getLinkedBean("kittyshippoproject:image", Imageset.class);
	}
}
