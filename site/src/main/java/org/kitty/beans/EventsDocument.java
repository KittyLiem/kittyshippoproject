package org.kitty.beans;

import java.util.Calendar;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.kitty.beans.Imageset;

@HippoEssentialsGenerated(internalName = "kittyshippoproject:eventsdocument")
@Node(jcrType = "kittyshippoproject:eventsdocument")
public class EventsDocument extends HippoDocument {
	/** 
	 * The document type of the events document.
	 */
	public final static String DOCUMENT_TYPE = "kittyshippoproject:eventsdocument";
	private final static String TITLE = "kittyshippoproject:title";
	private final static String DATE = "kittyshippoproject:date";
	private final static String INTRODUCTION = "kittyshippoproject:introduction";
	private final static String IMAGE = "kittyshippoproject:image";
	private final static String CONTENT = "kittyshippoproject:content";
	private final static String LOCATION = "kittyshippoproject:location";
	private final static String END_DATE = "kittyshippoproject:enddate";

	/** 
	 * Get the title of the document.
	 * @return the title
	 */
	@HippoEssentialsGenerated(internalName = "kittyshippoproject:title")
	public String getTitle() {
		return getProperty(TITLE);
	}

	/** 
	 * Get the date of the document, i.e. the start date of the event.
	 * @return the (start) date
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
	 * Get the end date of the document, i.e. the end date of the event.
	 * @return the end date
	 */
	@HippoEssentialsGenerated(internalName = "kittyshippoproject:enddate")
	public Calendar getEndDate() {
		return getProperty(END_DATE);
	}

	@HippoEssentialsGenerated(internalName = "kittyshippoproject:image")
	public Imageset getImage() {
		return getLinkedBean("kittyshippoproject:image", Imageset.class);
	}
}
