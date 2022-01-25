package cybersoft.backend.crm.filter;

import javax.servlet.annotation.WebFilter;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;

import cybersoft.backend.crm.servlet.util.UrlConst;

@WebFilter(displayName = "sitemesh", urlPatterns = UrlConst.GLOBAL)
public class LayoutFilter extends SiteMeshFilter {

}
