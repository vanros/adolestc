package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Adoles {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Adoles
	public static Var calcula_idade() throws Exception {
		return new Callable<Var>() {

			private Var data_nascimento_texto = Var.VAR_NULL;
			private Var data_nascimento = Var.VAR_NULL;
			private Var idade = Var.VAR_NULL;
			private Var mes_atual = Var.VAR_NULL;
			private Var mes_nascimento = Var.VAR_NULL;
			private Var dia_atual = Var.VAR_NULL;
			private Var dia_nascimento = Var.VAR_NULL;
			private Var idade_atual = Var.VAR_NULL;

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Entrou no bloco!!!").getObjectAsString());
				data_nascimento_texto = cronapi.screen.Operations
						.getValueOfField(Var.valueOf("Adolescente.active.dataDeNascimento"));
				System.out.println(data_nascimento_texto.getObjectAsString());
				data_nascimento = cronapi.conversion.Operations.stringToDate(data_nascimento_texto, Var.VAR_NULL);
				idade = cronapi.dateTime.Operations.getYearsBetweenDates(cronapi.dateTime.Operations.getNowNoHour(),
						data_nascimento);
				System.out.println(cronapi.dateTime.Operations.getNowNoHour().getObjectAsString());
				mes_atual = cronapi.dateTime.Operations.getMonth(cronapi.dateTime.Operations.getNowNoHour());
				mes_nascimento = cronapi.dateTime.Operations.getMonth(data_nascimento);
				dia_atual = cronapi.dateTime.Operations.getDay(cronapi.dateTime.Operations.getNowNoHour());
				dia_nascimento = cronapi.dateTime.Operations.getDay(data_nascimento);
				if (Var.valueOf(Var.valueOf(mes_atual.compareTo(mes_nascimento) < 0).getObjectAsBoolean()
						|| Var.valueOf(mes_atual.equals(mes_nascimento)).getObjectAsBoolean()
								&& Var.valueOf(dia_atual.compareTo(dia_nascimento) < 0).getObjectAsBoolean())
						.getObjectAsBoolean()) {
					idade_atual = cronapi.math.Operations.subtract(idade, Var.valueOf(1));
				} else {
					idade_atual = idade;
				}
				System.out.println(idade_atual.getObjectAsString());
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
						Var.valueOf("Adolescente.active.idade"), idade_atual);
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Descreva esta função...
	public static Var aniversariantes() throws Exception {
		return new Callable<Var>() {

			private Var temporario = Var.VAR_NULL;
			private Var lista_aniversariantes = Var.VAR_NULL;
			private Var aniversariantes = Var.VAR_NULL;

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Chamou o bloco!!!!!!!!!!!").getObjectAsString());
				lista_aniversariantes = cronapi.list.Operations.newList();
				System.out.println(cronapi.dateTime.Operations.getMonth(cronapi.dateTime.Operations.getNowNoHour())
						.getObjectAsString());
				aniversariantes = cronapi.database.Operations.query(Var.valueOf("app.entity.Adolescente"),
						Var.valueOf(
								"select a.nome, a.grupoDeVida.nome, a.dia, a.mes from Adolescente a where a.nome = :nome"),
						Var.valueOf("nome",
								cronapi.dateTime.Operations.getMonth(cronapi.dateTime.Operations.getNowNoHour())));
				while (cronapi.database.Operations.hasElement(aniversariantes).getObjectAsBoolean()) {
					temporario = cronapi.map.Operations
							.createObjectMapWith(
									Var.valueOf("nome",
											cronapi.database.Operations.getField(aniversariantes,
													Var.valueOf("this[0]"))),
									Var.valueOf("dia",
											cronapi.database.Operations.getField(aniversariantes,
													Var.valueOf("this[2]"))),
									Var.valueOf("mes",
											cronapi.database.Operations.getField(aniversariantes,
													Var.valueOf("this[3]"))),
									Var.valueOf("gv", cronapi.database.Operations.getField(aniversariantes,
											Var.valueOf("this[4]"))));
					cronapi.list.Operations.addLast(lista_aniversariantes, temporario);
					cronapi.database.Operations.next(aniversariantes);
				} // end while
				return lista_aniversariantes;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Descreva esta função...
	public static Var atividades() throws Exception {
		return new Callable<Var>() {

			private Var lista_atividades = Var.VAR_NULL;
			private Var atividades = Var.VAR_NULL;
			private Var temporario = Var.VAR_NULL;

			public Var call() throws Exception {
				lista_atividades = cronapi.list.Operations.newList();
				atividades = cronapi.database.Operations.query(Var.valueOf("app.entity.Atividades"),
						Var.valueOf(
								"select a.descricao, a.dia, a.mes, a.grupoDeVida.nome from Atividades a where a.mes = :mes"),
						Var.valueOf("mes",
								cronapi.dateTime.Operations.getMonth(cronapi.dateTime.Operations.getNowNoHour())));
				while (cronapi.database.Operations.hasElement(atividades).getObjectAsBoolean()) {
					temporario = cronapi.map.Operations.createObjectMapWith(
							Var.valueOf("descricao",
									cronapi.database.Operations.getField(atividades, Var.valueOf("this[0]"))),
							Var.valueOf("dia",
									cronapi.database.Operations.getField(atividades, Var.valueOf("this[1]"))),
							Var.valueOf("mes",
									cronapi.database.Operations.getField(atividades, Var.valueOf("this[2]"))),
							Var.valueOf("gv",
									cronapi.database.Operations.getField(atividades, Var.valueOf("this[3]"))));
					cronapi.list.Operations.addLast(lista_atividades, temporario);
					cronapi.database.Operations.next(atividades);
				} // end while
				return lista_atividades;
			}
		}.call();
	}

}
