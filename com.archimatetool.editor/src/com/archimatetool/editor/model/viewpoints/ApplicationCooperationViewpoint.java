/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.model.viewpoints;

import org.eclipse.emf.ecore.EClass;

import com.archimatetool.model.IArchimatePackage;


/**
 * Application Co-operation Viewpoint
 * 
 * @author Phillip Beauvoir
 */
public class ApplicationCooperationViewpoint extends AbstractViewpoint {
    
    EClass[] allowed = new EClass[] {
            IArchimatePackage.eINSTANCE.getLocation(),
            
            IArchimatePackage.eINSTANCE.getDataObject(),
            IArchimatePackage.eINSTANCE.getApplicationService(),
            IArchimatePackage.eINSTANCE.getApplicationFunction(),
            IArchimatePackage.eINSTANCE.getApplicationInteraction(),
            IArchimatePackage.eINSTANCE.getApplicationInterface(),
            IArchimatePackage.eINSTANCE.getApplicationComponent(),
            IArchimatePackage.eINSTANCE.getApplicationCollaboration(),

            IArchimatePackage.eINSTANCE.getJunction(),
            IArchimatePackage.eINSTANCE.getAndJunction(),
            IArchimatePackage.eINSTANCE.getOrJunction(),
            
            IArchimatePackage.eINSTANCE.getSpecialisationRelationship(),
            IArchimatePackage.eINSTANCE.getCompositionRelationship(),
            IArchimatePackage.eINSTANCE.getAggregationRelationship(),
            IArchimatePackage.eINSTANCE.getAssignmentRelationship(),
            IArchimatePackage.eINSTANCE.getRealisationRelationship(),
            IArchimatePackage.eINSTANCE.getTriggeringRelationship(),
            IArchimatePackage.eINSTANCE.getFlowRelationship(),
            IArchimatePackage.eINSTANCE.getUsedByRelationship(),
            IArchimatePackage.eINSTANCE.getAccessRelationship(),
            IArchimatePackage.eINSTANCE.getAssociationRelationship()
    };
    
    @Override
    public String getName() {
        return Messages.ApplicationCooperationViewpoint_0;
    }
    
    @Override
    public int getIndex() {
        return APPLICATION_COOPERATION_VIEWPOINT;
    }

    @Override
    public EClass[] getAllowedTypes() {
        return allowed;
    }
}