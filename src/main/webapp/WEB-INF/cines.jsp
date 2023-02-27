<%@ page  pageEncoding="UTF-8"%>

<% String[][] cines =(String[][]) session.getAttribute("data");
for(String [] cine:cines){



%>
<div class="contenido-interno" id="contenido-interno">
			<div class="contenido-interno" id="contenido-interno">

				<br/><h1>Nuestros Cines</h1><br/>
				<div class="contenido-cine">
	        	    <img src="img/cine/1.1.jpg" width="227" height="170"/>
            	   	<div class="datos-cine">
       				   	<h4><%= cines[1] %></h4><br/>
                		<span><%= cines[4] %><br/><br/><%= cines[5] %></span>
                	</div>
                	<br/>
                	<a href="svlCine?id=<%= cines[0] %>">
                		<img src="img/varios/ico-info2.png" width="150" height="40"/>
                	</a>
				</div>

			</div>
			</div>
			
<%}%>
			
			
			
			
			