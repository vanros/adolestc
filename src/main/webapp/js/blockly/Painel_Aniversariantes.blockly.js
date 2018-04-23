window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.PainelAniversariantes = window.blockly.js.blockly.PainelAniversariantes
		|| {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.PainelAniversariantes.esconder = function() {
	this.cronapi.screen.hideComponent("paineis");
}

/**
 * Painel_Aniversariantes
 */
window.blockly.js.blockly.PainelAniversariantes.exibir = function() {
	this.cronapi.screen.showComponent("paineis");
}
