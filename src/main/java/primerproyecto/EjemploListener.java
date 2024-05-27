// Generated from /home/fandreoli/Desktop/proyectoTC/TecnicasCompilacion/src/main/java/primerproyecto/Ejemplo.g4 by ANTLR 4.13.1
package primerproyecto;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EjemploParser}.
 */
public interface EjemploListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EjemploParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(EjemploParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(EjemploParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(EjemploParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(EjemploParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(EjemploParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(EjemploParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(EjemploParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(EjemploParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#listaDeclaradores}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaradores(EjemploParser.ListaDeclaradoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#listaDeclaradores}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaradores(EjemploParser.ListaDeclaradoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#declarador}.
	 * @param ctx the parse tree
	 */
	void enterDeclarador(EjemploParser.DeclaradorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#declarador}.
	 * @param ctx the parse tree
	 */
	void exitDeclarador(EjemploParser.DeclaradorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(EjemploParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(EjemploParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(EjemploParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(EjemploParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#expresionUnaria}.
	 * @param ctx the parse tree
	 */
	void enterExpresionUnaria(EjemploParser.ExpresionUnariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#expresionUnaria}.
	 * @param ctx the parse tree
	 */
	void exitExpresionUnaria(EjemploParser.ExpresionUnariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#operadorBinario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorBinario(EjemploParser.OperadorBinarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#operadorBinario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorBinario(EjemploParser.OperadorBinarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#operadorUnario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorUnario(EjemploParser.OperadorUnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#operadorUnario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorUnario(EjemploParser.OperadorUnarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(EjemploParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(EjemploParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#bucleWhile}.
	 * @param ctx the parse tree
	 */
	void enterBucleWhile(EjemploParser.BucleWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#bucleWhile}.
	 * @param ctx the parse tree
	 */
	void exitBucleWhile(EjemploParser.BucleWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#estructuraIf}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraIf(EjemploParser.EstructuraIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#estructuraIf}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraIf(EjemploParser.EstructuraIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#bucleFor}.
	 * @param ctx the parse tree
	 */
	void enterBucleFor(EjemploParser.BucleForContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#bucleFor}.
	 * @param ctx the parse tree
	 */
	void exitBucleFor(EjemploParser.BucleForContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(EjemploParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(EjemploParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(EjemploParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(EjemploParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumentos(EjemploParser.ListaArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumentos(EjemploParser.ListaArgumentosContext ctx);
}