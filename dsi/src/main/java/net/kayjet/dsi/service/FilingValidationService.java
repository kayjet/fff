/**
 * 
 */
package net.kayjet.dsi.service;

import java.sql.Timestamp;

//import org.springframework.security.access.annotation.Secured;

//import net.atpco.dsi.common.constant.DSIRoles;
//import net.atpco.dsi.filing.util.FilingRequest;
//import net.atpco.dsi.filing.util.FilingResponse;


/**
 * @author infosys
 *
 */

public interface FilingValidationService {
	
//	@Secured({DSIRoles.ROLE_DSI_UPDATE })
//	FilingResponse saveFilingValidation(final FilingRequest filingRequest);
	
//	@Secured({ DSIRoles.ROLE_DSI_INQUIRY, DSIRoles.ROLE_DSI_UPDATE })
//	FilingResponse retriveFilingValidationList(final FilingRequest request);
	
//	@Secured({DSIRoles.ROLE_DSI_UPDATE })
	Timestamp retrieveFilingValidationMaxLastModifyDate();
	
	void loadOrRefreshDSICacheDetails();
	

}
