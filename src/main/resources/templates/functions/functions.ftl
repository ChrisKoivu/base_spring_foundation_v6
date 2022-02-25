

<#function getFoundationTemplate name>
  <#local templateName = "">
  <#switch name>  
	  <#case "card">
	    <#local templateName="foundation-templates/card.ftl">
	    <#break>
	  <#case "panel">
	    <#local templateName="foundation-templates/panel.ftl">
	    <#break>
	  <#case "alert">
	     <#local templateName="foundation-templates/callout-alert.ftl">
	     <#break>
	  <#case "notification">
	     <#local templateName="foundation-templates/callout-success-slide.ftl">
	     <#break>
	  <#default>
	    <#local templateName="foundation-templates/standard.ftl">
	    <#break>
   </#switch>
   <#return templateName>
</#function>