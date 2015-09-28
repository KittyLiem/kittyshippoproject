package org.kitty.beans;

import java.util.Calendar;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.kitty.beans.Imageset;

@HippoEssentialsGenerated(internalName = "kittyshippoproject:newsdocument")
@Node(jcrType = "kittyshippoproject:newsdocument")
public class NewsDocument extends HippoDocument {
	/** 
	 * The document type of the news document.
	 */
	public final static String DOCUMENT_TYPE = "kittyshippoproject:newsdocument";
	private final static String TITLE = "kittyshippoproject:title";
	private final static String DATE = "kittyshippoproject:date";
	private final static String INTRODUCTION = "kittyshippoproject:introduction";
	private final static String IMAGE = "kittyshippoproject:image";
	private final static String CONTENT = "kittyshippoproject:content";
	private final static String LOCATION = "kittyshippoproject:location";
	private final static String AUTHOR = "kittyshippoproject:author";
	private final static String SOURCE = "kittyshippoproject:source";

	/** 
	 * Get the title of the document.
	 * @return the title
	 */
	@HippoEssentialsGenerated(internalName = "kittyshippoproject:title")
	public String getTitle() {
		return getProperty(TITLE);
	}

	/** 
	 * Get the date of the document.
	 * @return the date
	 */
	@HippoEssentialsGenerated(internalName = "kittyshippoproject:date")
	public Calendar getDate() {
		return getProperty(DATE);
	}

	/** 
	 * Get the introduction of the document.
	 * @return the introduction
	 */
	@HippoEssentialsGenerated(internalName = "kittyshippoproject:introduction")
	public String getIntroduction() {
		return getProperty(INTRODUCTION);
	}

	/** 
	 * Get the main content of the document.
	 * @return the content
	 */
	@HippoEssentialsGenerated(internalName = "kittyshippoproject:content")
	public HippoHtml getContent() {
		return getHippoHtml(CONTENT);
	}

	/** 
	 * Get the location of the document.
	 * @return the location
	 */
	@HippoEssentialsGenerated(internalName = "kittyshippoproject:location")
	public String getLocation() {
		return getProperty(LOCATION);
	}

	/** 
	 * Get the author of the document.
	 * @return the author
	 */
	@HippoEssentialsGenerated(internalName = "kittyshippoproject:author")
	public String getAuthor() {
		return getProperty(AUTHOR);
	}

	/** 
	 * Get the source of the document.
	 * @return the source
	 */
	@HippoEssentialsGenerated(internalName = "kittyshippoproject:source")
	public String getSource() {
		return getProperty(SOURCE);
	}

	@HippoEssentialsGenerated(internalName = "kittyshippoproject:image")
	public Imageset getImage() {
		return getLinkedBean("kittyshippoproject:image", Imageset.class);
	}
}
