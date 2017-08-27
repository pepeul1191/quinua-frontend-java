/*
Archivos que usa :
	+ 
*/
var RolView = Backbone.View.extend({
	el: '#modal-container',
	initialize: function(){
		//this.render();
		console.log("initialize");
	},
	render: function(){
		$("#btnModal").click(); 
		this.$el.html(this.getTemplate());
	}, 
	getTemplate: function() {
		var data = { };
		var template_compiled = null;
		$.ajax({
		   url: STATICS_URL + 'templates/rol.html', 
		   type: "GET", 
		   async: false, 
		   success: function(source) {
		   	var template = Handlebars.compile(source);
		   	template_compiled = template(data);
		   }
		});
		return template_compiled;
	},
	mostrarTabla: function(sistema_id){
		tablaRoles.BorrarTable();
		var ajax_rol = new AjaxPython(); 
		ajax_rol.Constructor("GET", BASE_URL + "rol/listar/" + sistema_id, "", false);
		tablaRoles.SetTableId("tablaRoles");
		tablaRoles.SetTableObj("tablaRoles");
		tablaRoles.SetTableHeader(array_json_th_rol);
		tablaRoles.SetTableBody(array_json_td_rol, array_json_btn_td_rol, ajax_rol);
		tablaRoles.SetTableFooter(array_json_btn_rol, false);
		tablaRoles.SetLabelMensaje("#txtMensajeRptaModal");
		//tablaRoles.SetExtraData(array_extra_data_rol);
		tablaRoles.SetURLGuardar(BASE_URL + "accesos/modulo/guardar");

		tablaRoles.MostrarTable();
	}
});