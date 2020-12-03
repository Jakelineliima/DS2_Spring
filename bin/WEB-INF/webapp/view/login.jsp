<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<div class="container">
		<h2>Página de Login</h2>
		<form action="login" method="POST">
		    Login: <input type="text" name="login" /> <br /> 
		    Senha: <input type="password" name="senha" /> <br />
		    <input type="submit" value="Efetuar Login" /> 
		</form>
	</div>
<jsp:include page="layoutrodape.jsp"></jsp:include>