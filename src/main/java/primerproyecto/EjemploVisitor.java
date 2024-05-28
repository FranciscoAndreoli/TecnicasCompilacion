// Generated from /home/fandreoli/Desktop/proyectoTC/TecnicasCompilacion/src/main/java/primerproyecto/Ejemplo.g4 by ANTLR 4.13.1
package primerproyecto;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EjemploParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EjemploVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EjemploParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(EjemploParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(EjemploParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(EjemploParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(EjemploParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#listaDeclaradores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeclaradores(EjemploParser.ListaDeclaradoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#declarador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarador(EjemploParser.DeclaradorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(EjemploParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(EjemploParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#expresionUnaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionUnaria(EjemploParser.ExpresionUnariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#operadorBinario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBinario(EjemploParser.OperadorBinarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#operadorUnario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorUnario(EjemploParser.OperadorUnarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(EjemploParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#bucleWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucleWhile(EjemploParser.BucleWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#estructuraIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuraIf(EjemploParser.EstructuraIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#bucleFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucleFor(EjemploParser.BucleForContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(EjemploParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(EjemploParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#asignacionSinPuntoComa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionSinPuntoComa(EjemploParser.AsignacionSinPuntoComaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#declaracionSinPuntoComa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionSinPuntoComa(EjemploParser.DeclaracionSinPuntoComaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(EjemploParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(EjemploParser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#listaArgumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgumentos(EjemploParser.ListaArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionFuncion(EjemploParser.DeclaracionFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#listaParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametros(EjemploParser.ListaParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(EjemploParser.ParametroContext ctx);
}