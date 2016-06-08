
var areaAdmin = "areaAdmin";
var areaAdminCliente = "areaAdminCliente";
var areaAdminVendedor = "areaAdminVendedor";
var consultarFeedback = "consultarFeedback";
var darFeedback = "darFeedback";
var escolherCategoria = "escolherCategoria";
var listarCategoria = "listarCategoria";
var listarJogos = "listarJogos";
var login = "login";

$(document).ready(function () {

    //por pre definiçao carrega a pagina main, que tem a descriçao das funçoes do site

		$("#conteudo").html(main);
		
	
	//clicar no botao da barra que diz Inicio
    $("#inicio").click(function () {
        $("#conteudo").html(main);
    });

    $("#areaAdmin").click(function () {
        $("#conteudo").html(areaAdmin);
        $("#menu1").html(areaAdminCliente);
        $("#menu2").html(areaAdminVendedor);
    });	

    $("#paginaProduto").click(function () {
        $("#conteudo").html(paginaProduto);
    });

    $("#adicionarProduto").click(function () {
        $("#conteudo").html(adicionarProduto);
    });

    $("#consultarFeedback").click(function () {
        $("#conteudo").html(consultarFeedback);
    });

    $("#darFeedback").click(function () {
        $("#conteudo").html(darFeedback);
    });

    $("#novoRegisto").click(function () {
        $("#conteudo").html(novoRegisto);
    });

    $("#listarCategoria").click(function () {
        $("#conteudo").html(listarCategoria);
    });			
	
	$("#listarJogos").click(function () {
        $("#conteudo").html(listarJogos);
    });	
	
	$("#login").click(function () {
        $("#conteudo").html(login);
    });	
	 
});

//Pagina Main
var main =	""+
"<div class='content-section-a'> " +
"	<div class='container'>" +
"		<div class='row'>" +
"			<div class='col-lg-5 col-sm-6'>" +
"				<div class='clearfix'></div>" +
"				<h2 class='section-heading'>Texto Generico: <small>Special Thanks</small></h2>" +
"				<p class='lead'>A special thanks to for bla bla bla bla bla bla bla, epa sim senhor, isto ate nem está muito feio, contudo acho que faltam gajas aqui, podiamos por uma gaja e o pessoal nao via o resto e assim nao reparavam que os links tao todos a apontar para sites de templates e coisas parecidas.</p>" +
"			</div>" +
"			<div class='col-lg-5 col-lg-offset-2 col-sm-6'>" +
"			    <img class='img-responsive' src='img/main1.png' alt=''>" +
"			</div>" +
"		 </div>" +
"	</div> " +
"</div>"
			
var areaAdmin =  "" +
"<div class='container'>" +
"    <h2>Area de Administração <small>Bem Vindo á Área de Administração</small></h2><br>" +
"    <div class='inner'></div>" +
"    <br>" +
""+
"   <ul class='nav nav-tabs'>" +
"       <li class='active'><a data-toggle='tab' href='#home'>Carlos Cabral</a></li>" +
"       <li><a data-toggle='tab' href='#menu1'>Comprador</a></li>" +
"       <li><a data-toggle='tab' href='#menu2'>Vendedor</a></li>" +
"   </ul>" +
"" +
"   <div class='tab-content'>" +
"       <div id='home' class='tab-pane fade in active'>" +
"           <h3>Area de Administração</h3>" +
"           <p>Bem vindo Carlos Cabral</p>" +
"           <p>&nbsp" +
"       </div>" +
"       <div id='menu1' class='tab-pane fade'>" +
"       </div>" +
"       <div id='menu2' class='tab-pane fade'>" +
"       </div>" +
"   </div>" +
"</div>"

var areaAdminCliente = ""+
"           <h3>Area de Comprador</h3>" +
"           <p>Consultar e gerir as minhas Compras</p>"  +
"				<div class='panel panel-default'>"  +
"  					<div class='panel-heading'>As minhas compras</div>"  +
"  					<div class='panel-body'>"  +
"						<table class='table table-striped'>" +
"    					<thead>" +
"      						<tr>" +
"        						<th>ID_Transação</th>" +
"        						<th>Jogo</th>" +
"        						<th>Vendedor</th>" +
"        						<th>Preço</th>" +
"      						</tr>" +
"    					</thead>" +
"    					<tbody>" +
"      						<tr>" +
"        						<td>001</td>" +
"        						<td>Call 4 Booty</td>" +
"       						<td>john_mayer</td>" +
"       						<td>50.05€</td>" +
"    				  		</tr>" +
"      						<tr>" +
"        						<td>002</td>" +
"        						<td>Call 4 Booty</td>" +
"       						<td>john_mayer</td>" +
"       						<td>20.0€</td>" +
"      						</tr>" +
"      						<tr>" +
"        						<td>003</td>" +
"        						<td>Call 4 Booty</td>" +
"       						<td>john_mayer</td>" +
"       						<td>16.5€</td>" +
"      						</tr>" +
"    						</tbody>" +
"  						</table>" +
"  					</div>"  +
"				</div>"  +
"           <p>Atribuir feedback a um vendedor</p>" +
"				<div class='panel panel-default'>"  +
"  					<div class='panel-heading'>Feedback por atribuir</div>"  +
"  					<div class='panel-body'>"  +
"						<table class='table table-striped'>" +
"    					<thead>" +
"      						<tr>" +
"        						<th>ID_Transação</th>" +
"        						<th>Vendedor</th>" +
"        						<th>Feedback</th>" +
"      						</tr>" +
"    					</thead>" +
"    					<tbody>" +
"      						<tr>" +
"        						<td>001</td>" +
"        						<td>john_mayer</td>" +
"       						<td><span class='label label-success'>Atribuir Positivo</span> &nbsp; <span class='label label-danger'>Atribuir Negativo</span></td>" +
"    				  		</tr>" +
"      						<tr>" +
"        						<td>002</td>" +
"        						<td>john_mayer</td>" +
"       						<td><span class='label label-success'>Atribuir Positivo</span> &nbsp; <span class='label label-danger'>Atribuir Negativo</span></td>" +
"      						</tr>" +
"      						<tr>" +
"        						<td>003</td>" +
"        						<td>john_mayer</td>" +
"       						<td><span class='label label-success'>Atribuir Positivo</span> &nbsp; <span class='label label-danger'>Atribuir Negativo</span></td>" +
"      						</tr>" +
"    						</tbody>" +
"  						</table>" +
"  					</div>"  +
"				</div>"  +
"           <p>Consultar o meu feedback de comprador</p>"+
"				<div class='panel panel-default'>"  +
"  					<div class='panel-heading'>Feedback recebido</div>"  +
"  					<div class='panel-body'>"  +
"						<table class='table table-striped'>" +
"    					<thead>" +
"      						<tr>" +
"        						<th>ID_Transação</th>" +
"        						<th>Vendedor</th>" +
"        						<th>Feedback</th>" +
"      						</tr>" +
"    					</thead>" +
"    					<tbody>" +
"      						<tr>" +
"        						<td>001</td>" +
"        						<td>john_mayer</td>" +
"       						<td><span class='label label-success'>Feedback Positivo </span></td>" +
"    				  		</tr>" +
"      						<tr>" +
"        						<td>002</td>" +
"        						<td>john_mayer</td>" +
"       						<td><span class='label label-success'>Feedback Positivo </span></td>" +
"      						</tr>" +
"      						<tr>" +
"        						<td>003</td>" +
"        						<td>john_mayer</td>" +
"       						<td><span class='label label-danger'>Feedback Negativo </span></td>" +
"      						</tr>" +
"    						</tbody>" +
"  						</table>" +
"  					</div>"  +
"				</div>" 

var areaAdminVendedor = ""+
"           <h3>Area de Vendedor</h3>" +
"           <p>Consultar e gerir as minhas Vendas</p>"  +
"				<div class='panel panel-default'>"  +
"  					<div class='panel-heading'>As minhas vendas</div>"  +
"  					<div class='panel-body'>"  +
"						<table class='table table-striped'>" +
"    					<thead>" +
"      						<tr>" +
"        						<th>ID_Transação</th>" +
"        						<th>Jogo</th>" +
"        						<th>Comprador</th>" +
"        						<th>Preço</th>" +
"      						</tr>" +
"    					</thead>" +
"    					<tbody>" +
"      						<tr>" +
"        						<td>001</td>" +
"        						<td>Call 4 Booty</td>" +
"       						<td>john_mayer</td>" +
"       						<td>50.05€</td>" +
"    				  		</tr>" +
"      						<tr>" +
"        						<td>002</td>" +
"        						<td>Call 4 Booty</td>" +
"       						<td>john_mayer</td>" +
"       						<td>20.0€</td>" +
"      						</tr>" +
"      						<tr>" +
"        						<td>003</td>" +
"        						<td>Call 4 Booty</td>" +
"       						<td>john_mayer</td>" +
"       						<td>16.5€</td>" +
"      						</tr>" +
"    						</tbody>" +
"  						</table>" +
"  					</div>"  +
"				</div>"  +
"           <p>Atribuir feedback a um comprador</p>" +
"				<div class='panel panel-default'>"  +
"  					<div class='panel-heading'>Feedback por atribuir</div>"  +
"  					<div class='panel-body'>"  +
"						<table class='table table-striped'>" +
"    					<thead>" +
"      						<tr>" +
"        						<th>ID_Transação</th>" +
"        						<th>Comprador</th>" +
"        						<th>Feedback</th>" +
"      						</tr>" +
"    					</thead>" +
"    					<tbody>" +
"      						<tr>" +
"        						<td>001</td>" +
"        						<td>john_mayer</td>" +
"       						<td><span class='label label-success'>Atribuir Positivo</span> &nbsp; <span class='label label-danger'>Atribuir Negativo</span></td>" +
"    				  		</tr>" +
"      						<tr>" +
"        						<td>002</td>" +
"        						<td>john_mayer</td>" +
"       						<td><span class='label label-success'>Atribuir Positivo</span> &nbsp; <span class='label label-danger'>Atribuir Negativo</span></td>" +
"      						</tr>" +
"      						<tr>" +
"        						<td>003</td>" +
"        						<td>john_mayer</td>" +
"       						<td><span class='label label-success'>Atribuir Positivo</span> &nbsp; <span class='label label-danger'>Atribuir Negativo</span></td>" +
"      						</tr>" +
"    						</tbody>" +
"  						</table>" +
"  					</div>"  +
"				</div>"  +
"           <p>Consultar o meu feedback de vendedor</p>"+
"				<div class='panel panel-default'>"  +
"  					<div class='panel-heading'>Feedback recebido</div>"  +
"  					<div class='panel-body'>"  +
"						<table class='table table-striped'>" +
"    					<thead>" +
"      						<tr>" +
"        						<th>ID_Transação</th>" +
"        						<th>Comprador</th>" +
"        						<th>Feedback</th>" +
"        						<th>Observações</th>" +
"      						</tr>" +
"    					</thead>" +
"    					<tbody>" +
"      						<tr>" +
"        						<td>001</td>" +
"        						<td>john_mayer</td>" +
"       						<td><span class='label label-success'>Feedback Positivo </span></td>" +
"        						<td>Ok</td>" +
"    				  		</tr>" +
"      						<tr>" +
"        						<td>002</td>" +
"        						<td>john_mayer</td>" +
"       						<td><span class='label label-success'>Feedback Positivo </span></td>" +
"        						<td>Ok</td>" +
"      						</tr>" +
"      						<tr>" +
"        						<td>003</td>" +
"        						<td>john_mayer</td>" +
"       						<td><span class='label label-danger'>Feedback Negativo </span></td>" +
"        						<td>CHULOOO</td>" +
"      						</tr>" +
"    						</tbody>" +
"  						</table>" +
"  					</div>"  +
"				</div>" 

//var consultarFeedback = "consultarFeedback";
//var darFeedback = "darFeedback";

var paginaProduto =  "" +
"<div class='container'>" +
"<br>" + 
"           <h2>Call of Duty 3 <small>Steam</small></h2><br>" +
"           <div class='row'>" +
"               <div class='col-sm-4'>" +
"                   <div class='thumbnail'>" +
"                       <a href='#'><img src='img/x.jpg' alt='AI'></a>" + 
"                       <div class='caption'>" +
"                       </div>" +
"                   </div>" +
"               </div>" +
"               <div class='col-sm-8'>" + 
"                   <div class='thumbnail'>" +
"                       <div class='caption'>" +
"                           <h3>Vendido Por:</h3>" +
"                           <p>UsernameCFI (<small>Ver Feedback </small><span class='badge'>20</span>)</p>" +
"                           <h3>Licitação Actual <span class='badge'>5</span></h3>" +
"                           <p>22.20 € (<small>UsernameCFI</small>)</p>" +
"                           <h3>Tempo Restante</h3>" +
"                           <p>4d 07h <small>(05 Jun, 2016)</small></p>" +
"                       </div>" +
"                   </div>" +
"               </div>" +
"               <div class='col-sm-8'>" +
"                   <div class='thumbnail'>" +
"                       <div class='caption'>" +
"                           <h3>Licitar Agora </h3>" +
"                           <div class='input-group'>" +
"                               <span class='input-group-addon'>€ </span>" +
"                               <input type='text' class='form-control'>" +
"                               <span class='input-group-btn'>" +
"                                   <button class='btn btn-default' type='button'>Licitar</button>" +
"                               </span>" +
"                           </div>" +
"                       </div>" +
"                   </div>" +
"               </div>" +
"           </div>" +
"</div>"

var adicionarProduto = ""+
"<div class='container'>" +
"    <h2>Adicionar Produto</h2><br>" +
"    <form role='form'>" +
"        <div class='form-group'>" +
"            <h2><small>Detalhes da Venda</small></h2><br>" +
"            <label for='text'>Jogo:</label>" +
"            <select id='listaJogos'></select><br><br>" +
"            <label for='text'>Data de Inicio:</label>" +
"            <input type='date' class='form-control' id='dataInicio'><br>" +
"            <label for='text'>Data de Fim:</label>" +
"            <input type='date' class='form-control' id='dataFim'><br>" +
"            <label for='text'>Preço:</label>" +
"               <div class='input-group'>" +
"                   <input type='text' class='form-control'>" +
"                   <span class='input-group-addon'>€ </span>" +
"                   </span>" +
"               </div>" +
"               </br>" +
"            <a href='#main' id='confirmarReserva' class='btn btn-success'>Confirmar</a> &nbsp;" +
"            <a href='#main' id='cancelarReserva' class='btn btn-warning'>Cancelar<a/>" +
"        </div>" +
"    </form>" +
"    <br>" +
"</div>"

var escolherCategoria = "escolherCategoria";
var listarCategoria = "listarCategoria";

var listarCategoria = "" +
"<div class='container'>" +
"    <h2>Categorias <small>Aqui pode consultar todas os jogos de cada categoria que temos disponiveis</small></h2><br>" +
"    <div class='inner'></div>" +
"    <br>" +
"" +
"   <div class='row'>" +
"       <div class='col-sm-4'>" +
"           <div class='thumbnail'>" +
"               <a href='#'><img src='img/x.jpg' alt='AI'></a>" + 
"               <div class='caption'>" +
"                   <h3>Categoria</h3>" +
"                   <p>Descrição</p>" +
"                   </div>" +
"           </div>" +
"       </div>" +
"    </div>" +
"</div>"

var listarJogos = "" +
"<div class='container'>" +
"    <h2>Jogos <small>Aqui pode consultar toda a nossa oferta de videojogos</small></h2><br>" +
"    <br>" +
"" +
"   <div class='panel panel-default'> " +
"       <div class='panel-heading'>" +
"	        <div class='row'>" +
"       	   <div id ='demo' class='col-sm-6'>" +
"                  <h3 id='marcaModelo' + i +'' class='panel-title'>Call of Duty 8</h3>" +    
"              </div>" +
"              <div id ='demo' class='col-sm-6'>" +
"                  <p align='right'>" +
"                      <a href='#main' class='reservarFrotaX'>Ver Ofertas</a>" +
"                  </p>" +
"              </div>" +
"           </div>" +
"       </div>" +
"   </div>" +
"" +
"   <div class='panel-body'>" +
"       <div class='row'>" +
"           <div id ='demo' class='col-sm-3'><img id='img' + i + '' src='img/x.jpg' class='img-responsive' alt='Jogo' width='304' height='236'> </div>" +
"               <div class='col-sm-3'>" +
"                   <p id='preco' >Preços:</p><br>" +
"                   <p id='precoMin' >Desde 15,07€ (<small><a href='#'>VendedorX</a></small>)</p>" +
"                   <p id='precoMax'>Até 55,00€ (<small><a href='#'>VendedorY</a></small>)</p>" +
"               </div>" +
"           <div class='col-sm-6'>Requesitos Minimos</div>" +
"       </div>" +
"   </div>" +
"</div>"

var login = "" +
"<div class='container'>" +
"    <h2>Login <small>Inicie a sua sessão aqui</small></h2><br>" +
"    <br>" +
"    <div class='row'>" +
"        <div class='col-md-2'>" +
"            <form class='form-horizontal' action='' method='POST'>" +
"                <fieldset><br>" +
"                    <div class='form-group'>" +
"                        <!-- Username -->" +
"                        <label c for='username'>Username</label>" +
"                        <div class='controls'>" +
"                            <input type='text' id='username' value='#{Login.user}' name='username' placeholder='' class='form-control input-xlarge '>" +
                              
"                        </div>" +
"                    </div>" +
"                    <div class='form-group'>" +
"                        <!-- Password-->" +
"                        <label for='password'>Password</label>" +
"                        <div class='controls'>" +
"                            <input type='password' id='password' value='#{Login.password}' name='password' placeholder='' class='form-control input-xlarge'>" +
"                        </div>" +
"                    </div>" +
"                    <div class='form-group'>" +
"                        <!-- Button -->" +
"                        <div class='controls'>" +
"                            <a href='#' id='botaologin' action='#{LoginView.loginProject()}' value='Login' update='loginForm' ajax='true' class='btn btn-default'>Login<a />" +
"                        </div>" +
"                        <br>" +
"                    </div>" +
"                </fieldset>" +
"            </form>" +
"        </div>" +
"    </div>" +
"</div>"

var novoRegisto = ""+
"<div class='container'>" +
"     <h2>Registar Utilizador</h2><br>" +
"     <form role='form'>" +
        
"       <div class='form-group'>" +
        
"         <label for='text'>Nome:</label>" +
"         <input type='text' class='form-control' id='nome' placeholder='Primeiro e ultimo nome'><br>" +

"         <label for='dataNasc'>Data Nacimento:</label>" +
"         <input type='date' class='form-control' id='dataNasc' placeholder='DD/MM/AAA'><br>" +
          
"         <label for='username'>Username:</label>" +
"         <input type='text' class='form-control' id='username' placeholder='Username'><br>" +
          
"         <label for='pwd'>Password:</label>" +
"         <input type='password' class='form-control' id='pwd' placeholder='Password'><br>" +
          
"         <label>" +
"         <input type='checkbox'> Remember me</label><br>" +
        
"       </div>" +
        
"       <a href='#main' id='submeterNovoUser' class='btn btn-default'>Submeter</a>" +
"      </form>" +
"      <br>" +
"   </div>"