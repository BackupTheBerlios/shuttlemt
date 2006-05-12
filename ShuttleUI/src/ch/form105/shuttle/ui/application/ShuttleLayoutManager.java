// Created on 30.01.2006
/*
 * Copyright (c) 2004 Kaiser Industrie Automation AG Nordringstrasse 9 4702
 * Oensingen
 * 
 * All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Library General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option) any
 * later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Library General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place - Suite 330, Boston, MA 02111-1307, USA.
 */
package ch.form105.shuttle.ui.application;



import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;

import ch.form105.shuttle.ui.view.player.ImportPlayerView;

public class ShuttleLayoutManager  {
	
	
	public static final String ID = "ShuttleUI.perspective"; //$NON-NLS-1$

    /**
     * @see com.pco.client.plugin.planning.perspective.LayoutManager#createLayout()
     */
    public void createLayout(IPageLayout layout, String ID) {
    	// placeholder reserves a slot
        layout.setEditorAreaVisible(false);
        IFolderLayout right = layout.createFolder("bottomRight", IPageLayout.RIGHT,
                0.3f, IPageLayout.ID_EDITOR_AREA);
        right.addPlaceholder(ImportPlayerView.ID);
        
        IFolderLayout left = layout.createFolder("bottomLeft", IPageLayout.LEFT,
                0.7f, IPageLayout.ID_EDITOR_AREA);
        left.addView("ShuttleUI.ProjectView");
        


    }

}
