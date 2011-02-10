<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" indent="yes"/>
<xsl:template match="portlet">
    <div class="portlet-background-colored" >
        <xsl:if test="not(string(display-portlet-title)='1')">
            <h3 class="portlet-background-colored-header">
                <xsl:value-of disable-output-escaping="yes" select="portlet-name" />
            </h3>
        </xsl:if>
   	    <xsl:apply-templates select="quicklinks-portlet" />
   	</div>
</xsl:template>

<xsl:template match="quicklinks-portlet">
	<xsl:apply-templates select="quicklinks-portlet-content" />
</xsl:template>

<xsl:template match="quicklinks-portlet-content">
	<xsl:apply-templates select="quicklinks" />
</xsl:template>

<xsl:template match="quicklinks">
	<ul class="{@cssStyle}" id="">
		<xsl:apply-templates select="entry" />
	</ul>
	<xsl:if test="contains(@cssStyle,'sf-menu')">
	<script type="text/javascript">
		$("ul.sf-menu").supersubs({ 
       		minWidth:    12,   // minimum width of sub-menus in em units 
       		maxWidth:    27,   // maximum width of sub-menus in em units 
       		extraWidth:  1     // extra width can ensure lines don't sometimes turn over 
                          		// due to slight rounding differences and font-family 
   		}).superfish();  // call supersubs first, then superfish, so that subs are 
           		         // not display:none when measuring. Call before initialising 
						// containing tabs for same reason. 
	</script>
	</xsl:if>
</xsl:template>

<xsl:template match="entry">
	<li>
		<xsl:apply-templates select="entry_content" />
		<xsl:if test="not(string(entry)='')">
			<ul>
				<xsl:apply-templates select="entry" />
			</ul>
		</xsl:if>
	</li>
</xsl:template>

<xsl:template match="entry_content">
	<xsl:value-of disable-output-escaping="yes" select="." />
</xsl:template>

</xsl:stylesheet>