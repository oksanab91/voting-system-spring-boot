
package com.eduonix.breadcrumbs;

import com.eduonix.votingsystem.entity.Candidate;
import com.eduonix.votingsystem.entity.Citizen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

/**
 *
 * @author Oks
 */
@Component
public class BreadCrumbsBuilder {
    public final Logger logger = Logger.getLogger(BreadCrumbsBuilder.class);
    public List<Breadcrumb> breadcrumbs = new ArrayList<>();
    
    public List<Breadcrumb> getBreadcrumbs() throws java.lang.IllegalArgumentException{
        //final Candidate candidate, final Citizen citizen
        breadcrumbs = new ArrayList<>();
        
        String currentUrl = "/voteFor/";
        breadcrumbs.add(new Breadcrumb(currentUrl, "voteFor"));
        
        currentUrl = "/doLogin/";
        breadcrumbs.add(new Breadcrumb(currentUrl, "doLogin"));
        
        currentUrl = "/home/";
        breadcrumbs.add(new Breadcrumb(currentUrl, "home"));
        
        logger.info("in breadcrumbs");
        
        Collections.reverse(breadcrumbs);
        return breadcrumbs;
    }

    public BreadCrumbsBuilder() {
        breadcrumbs = new ArrayList<>();
    }
    
}
