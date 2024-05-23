// Generated from /home/coti/Downloads/TecCompilacion2024-master(1)/TecCompilacion2024-master/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1

package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladoresParser}.
 */
public interface compiladoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(compiladoresParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(compiladoresParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#estructuraC}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraC(compiladoresParser.EstructuraCContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#estructuraC}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraC(compiladoresParser.EstructuraCContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#ifEstructura}.
	 * @param ctx the parse tree
	 */
	void enterIfEstructura(compiladoresParser.IfEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#ifEstructura}.
	 * @param ctx the parse tree
	 */
	void exitIfEstructura(compiladoresParser.IfEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#forEstructura}.
	 * @param ctx the parse tree
	 */
	void enterForEstructura(compiladoresParser.ForEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#forEstructura}.
	 * @param ctx the parse tree
	 */
	void exitForEstructura(compiladoresParser.ForEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#whileEstructura}.
	 * @param ctx the parse tree
	 */
	void enterWhileEstructura(compiladoresParser.WhileEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#whileEstructura}.
	 * @param ctx the parse tree
	 */
	void exitWhileEstructura(compiladoresParser.WhileEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(compiladoresParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(compiladoresParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compiladoresParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compiladoresParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(compiladoresParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(compiladoresParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(compiladoresParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(compiladoresParser.FactorContext ctx);
}