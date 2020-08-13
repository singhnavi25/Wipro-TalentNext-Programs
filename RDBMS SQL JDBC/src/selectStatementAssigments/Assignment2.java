package selectStatementAssigments;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment2 
{
	/*
	 * Create a query to display the last name, job ID, hire date, and employee ID for 
	 * each employee, with the employee ID appearing first. Provide an alias STARTDATE 
	 * for the HIRE_DATE column.
	 */
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String hostName = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "system";
		String password = "0001";
		// Creating connection
		Connection con = DriverManager.getConnection(hostName, username, password);
		Statement s = con.createStatement();

		DatabaseMetaData dbMetaData = con.getMetaData();
		   
	    ResultSet tables = dbMetaData.getTables(null, null, "employee".toUpperCase(), null); 
	    
	    if(tables.next())
	    {
	    	System.out.println("Table is already exist");
	    }
	    else
	    {
	    	System.out.println("Table is not exist");
			String create_table = "Create table employee(EMPLOYEE_ID number(5), FIRST_NAME varchar2(15), LAST_NAME varchar2(15) Not Null,EMAIL varchar2(30), PHONE_NUMBER number(15), HIRE_DATE date, JOB_ID varchar2(10), SALARY number(10, 2), COMMISSION_PCT number(5, 2), MANAGER_ID number(5), DEPARTMENT_ID number(3))";
			s.execute(create_table);
			// Inserting data into table
		    s.execute("insert into employee values(100, 'Steven', 'King', 'SKING', 5151234567, TO_DATE('2003-06-17', 'yyyy/mm/dd'), 'AD_PRES', 24000.00, 500.00, 0, 90)");
			s.execute("insert into employee values(101, 'Neena', 'Kochhar', 'NKOCHHAR', 5151234568, TO_DATE('2005-09-21', 'yyyy/mm/dd'), 'AD_VP', 17000.0, 0.0, 100, 90)");
			s.execute("insert into employee values(102, 'Lex', 'De Haan', 'LDEHAAN', 5151234569, TO_DATE('2001-01-13', 'yyyy/mm/dd'), 'AD_VP', 17000.0, 0.0, 100, 90)");
			s.execute("insert into employee values(103, 'Alexander', 'Hunold', 'AHUNOLD', 5904234567, TO_DATE('2006-01-03', 'yyyy/mm/dd'), 'IT_PROG', 9000.0, 710.0, 102, 60)");
			s.execute("insert into employee values(104, 'Bruce', 'Ernst', 'BERNST', 5904234568, TO_DATE('2007-05-21', 'yyyy/mm/dd'), 'IT_PROG', 6000.0, 0.0, 103, 60)");
			s.execute("insert into employee values(105, 'David', 'Austin', 'DAUSTIN', 5904234569, TO_DATE('2005-06-25', 'yyyy/mm/dd'), 'IT_PROG', 4800.0, 0.0, 103, 60)");
			s.execute("insert into employee values(106, 'Valli', 'Pataballa', 'VPATABAL', 5904234560, TO_DATE('2006-02-05', 'yyyy/mm/dd'), 'IT_PROG', 4800.0, 0.0, 103, 60)");
			s.execute("insert into employee values(107, 'Diana', 'Lorentz', 'DLORENTZ', 5904235567, TO_DATE('2007-02-07', 'yyyy/mm/dd'), 'IT_PROG', 4200.0, 0.0, 103, 60)");
			s.execute("insert into employee values(108, 'Nancy', 'Greenberg', 'NGREENBE', 5151244569, TO_DATE('2002-08-17', 'yyyy/mm/dd'), 'FI_MGR', 12008.0, 0.0, 101, 100)");
			s.execute("insert into employee values(109, 'Daniel', 'Faviet', 'DFAVIET', 5151244169, TO_DATE('2002-08-16', 'yyyy/mm/dd'), 'FI_ACCOUNT', 9000.0, 0.0, 108, 100)");
			s.execute("insert into employee values(110, 'John', 'Chen', 'JCHEN', 5151244269, TO_DATE('2005-09-28', 'yyyy/mm/dd'), 'FI_ACCOUNT', 8200.0, 0.0, 108, 100)");
			
			s.execute("insert into employee values(111, 'Ismael', 'Sciarra', 'ISCIARRA', 5151244369, TO_DATE('2005-09-30', 'yyyy/mm/dd'), 'FI_ACCOUNT', 7700.0, 0.0, 108, 100)");
			s.execute("insert into employee values(112, 'Jose Manuel', 'Urman', 'JMURMAN', 5151244469, TO_DATE('2006-03-07', 'yyyy/mm/dd'), 'FI_ACCOUNT', 7800.0, 0.0, 108, 100)");
			s.execute("insert into employee values(113, 'Luis', 'Popp', 'LPOPP', 5151244567, TO_DATE('2007-12-07', 'yyyy/mm/dd'), 'FI_ACCOUNT', 6900.0, 0.0, 108, 100)");
			s.execute("insert into employee values(114, 'Den', 'Raphaely', 'DRAPHEAL', 5151274561, TO_DATE('2002-12-07', 'yyyy/mm/dd'), 'PU_MAN', 11000.0, 200.0, 100, 30)");
			s.execute("insert into employee values(115, 'Alexander', 'Khoo', 'AKHOO', 5151274562, TO_DATE('2003-05-18', 'yyyy/mm/dd'), 'PU_CLERK', 3100.0, 0.0, 114, 30)");
			s.execute("insert into employee values(116, 'Shelli', 'Baida', 'SBAIDA', 5151274563, TO_DATE('2005-12-24', 'yyyy/mm/dd'), 'PU_CLERK', 2900.0, 0.0, 114, 30)");
			s.execute("insert into employee values(117, 'Sigal', 'Tobias', 'STOBIAS', 5151274564, TO_DATE('2005-07-24', 'yyyy/mm/dd'), 'PU_CLERK', 2800.0, 0.0, 114, 30)");
			s.execute("insert into employee values(118, 'Guy', 'Himuro', 'GHIMURO', 5151274565, TO_DATE('2006-11-15', 'yyyy/mm/dd'), 'PU_CLERK', 2600.0, 0.0, 114, 30)");
			s.execute("insert into employee values(119, 'Karen', 'Colmenares', 'KCOLMENA', 5151274566, TO_DATE('2007-08-10', 'yyyy/mm/dd'), 'PU_CLERK', 2500.0, 0.0, 114, 30)");
			s.execute("insert into employee values(120, 'Matthew', 'Weiss', 'MWEISS', 6501231234, TO_DATE('2004-07-18', 'yyyy/mm/dd'), 'ST_MAN', 8000.0, 0.0, 100, 50)");
			
			s.execute("insert into employee values(121, 'Adam', 'Fripp', 'AFRIPP', 6501232234, TO_DATE('2005-04-10', 'yyyy/mm/dd'), 'ST_MAN', 8200.0, 0.0, 100, 50)");
			s.execute("insert into employee values(122, 'Payam', 'Kaufling', 'PKAUFLIN', 6501233234, TO_DATE('2003-05-01', 'yyyy/mm/dd'), 'ST_MAN', 7900.0, 0.0, 100, 50)");
			s.execute("insert into employee values(123, 'Shanta', 'Vollman', 'SVOLLMAN', 6501234234, TO_DATE('2005-10-10', 'yyyy/mm/dd'), 'ST_MAN', 6500.0, 0.0, 100, 50)");
			s.execute("insert into employee values(124, 'Kevin', 'Mourgos', 'KMOURGOS', 6501235234, TO_DATE('2007-11-16', 'yyyy/mm/dd'), 'ST_MAN', 5800.0, 0.0, 100, 50)");
			s.execute("insert into employee values(125, 'Julia', 'Nayer', 'JNAYER', 6501241214, TO_DATE('2005-07-16', 'yyyy/mm/dd'), 'ST_CLERK', 3200.0, 0.0, 120, 50)");
			s.execute("insert into employee values(126, 'Irene', 'Mikkilineni', 'IMIKKILI', 6501241224, TO_DATE('2006-09-28', 'yyyy/mm/dd'), 'ST_CLERK', 2700.0, 0.0, 120, 50)");
			s.execute("insert into employee values(127, 'James', 'Landry', 'JLANDRY', 6501241334, TO_DATE('2007-01-14', 'yyyy/mm/dd'), 'ST_CLERK', 2400.0, 100.0, 120, 50)");
			s.execute("insert into employee values(128, 'Steven', 'Markle', 'SMARKLE', 6501241434, TO_DATE('2008-03-08', 'yyyy/mm/dd'), 'ST_CLERK', 2200.0, 0.0, 120, 50)");
			s.execute("insert into employee values(129, 'Laura', 'Bissot', 'LBISSOT', 6501245234, TO_DATE('2005-08-20', 'yyyy/mm/dd'), 'ST_CLERK', 3300.0, 0.0, 121, 50)");
			s.execute("insert into employee values(130, 'Mozhe', 'Atkinson', 'MATKINSO', 6501246234, TO_DATE('2005-10-30', 'yyyy/mm/dd'), 'ST_CLERK', 2800.0, 0.0, 121, 50)");
			
			s.execute("insert into employee values(131, 'James', 'Marlow', 'JAMRLOW', 6501247234, TO_DATE('2005-02-16', 'yyyy/mm/dd'), 'ST_CLERK', 2500.0, 0.0, 121, 50)");
			s.execute("insert into employee values(132, 'TJ', 'Olson', 'TJOLSON', 6501248234, TO_DATE('2007-04-10', 'yyyy/mm/dd'), 'ST_CLERK', 2100.0, 0.0, 121, 50)");
			s.execute("insert into employee values(133, 'Jason', 'Mallin', 'JMALLIN', 6501271934, TO_DATE('2004-06-14', 'yyyy/mm/dd'), 'ST_CLERK', 3300.0, 0.0, 122, 50)");
			s.execute("insert into employee values(134, 'Michael', 'Rogers', 'MROGERS', 6501271834, TO_DATE('2006-08-26', 'yyyy/mm/dd'), 'ST_CLERK', 2900.0, 0.0, 122, 50)");
			s.execute("insert into employee values(135, 'Ki', 'Gee', 'KGEE', 6501271734, TO_DATE('2007-12-12', 'yyyy/mm/dd'), 'ST_CLERK', 2400.0, 0.0, 122, 50)");
			s.execute("insert into employee values(136, 'Hazel', 'Philtanker', 'HPHILTAN', 6501271634, TO_DATE('2008-02-06', 'yyyy/mm/dd'), 'ST_CLERK', 2200.0, 0.0, 122, 50)");
			s.execute("insert into employee values(137, 'Renske', 'Ladwig', 'RLADWIG', 6501211234, TO_DATE('2003-07-14', 'yyyy/mm/dd'), 'ST_CLERK', 3600.0, 0.0, 123, 50)");
			s.execute("insert into employee values(138, 'Stephen', 'Stiles', 'SSTILES', 6501212034, TO_DATE('2005-10-26', 'yyyy/mm/dd'), 'ST_CLERK', 3200.0, 0.0, 123, 50)");
			s.execute("insert into employee values(139, 'John', 'Seo', 'JSEO', 6501212019, TO_DATE('2006-02-12', 'yyyy/mm/dd'), 'ST_CLERK', 2700.0, 0.0, 123, 50)");
			s.execute("insert into employee values(140, 'Joshua', 'Patel', 'JPATEL', 6501211834, TO_DATE('2006-04-06', 'yyyy/mm/dd'), 'ST_CLERK', 2500.0, 0.0, 123, 50)");
			
			s.execute("insert into employee values(141, 'Trenna', 'Rajs', 'TRAJS', 6501218009, TO_DATE('2003-10-17', 'yyyy/mm/dd'), 'ST_CLERK', 3500.0, 0.0, 124, 50)");
			s.execute("insert into employee values(142, 'Curtis', 'Davies', 'CDAVIES', 6501212994, TO_DATE('2005-01-29', 'yyyy/mm/dd'), 'ST_CLERK', 3100.0, 0.0, 124, 50)");
			s.execute("insert into employee values(143, 'Randall', 'Matos', 'RMATOS', 6501212874, TO_DATE('2006-03-15', 'yyyy/mm/dd'), 'ST_CLERK', 2600.0, 0.0, 124, 50)");
			s.execute("insert into employee values(144, 'Peter', 'Vargas', 'PVARGAS', 6501212004, TO_DATE('2006-07-09', 'yyyy/mm/dd'), 'ST_CLERK', 2500.0, 0.0, 124, 50)");
			s.execute("insert into employee values(145, 'John', 'Russell', 'JRUSSEL', 11441344429268, TO_DATE('2004-10-01', 'yyyy/mm/dd'), 'SA_MAN', 14000.0, 0.4, 100, 80)");
			s.execute("insert into employee values(146, 'Karen', 'Partners', 'KPARTNER', 11441344467268, TO_DATE('2005-01-05', 'yyyy/mm/dd'), 'SA_MAN', 13500.0, 0.3, 100, 80)");
			s.execute("insert into employee values(147, 'Alberto', 'Errazuriz', 'AERRAZUR', 11441344429278, TO_DATE('2005-03-10', 'yyyy/mm/dd'), 'SA_MAN', 12000.0, 0.3, 100, 80)");
			s.execute("insert into employee values(148, 'Gerald', 'Cambrault', 'GCAMBRAU', 11441344619268, TO_DATE('2007-10-15', 'yyyy/mm/dd'), 'SA_MAN', 11000.0, 0.3, 100, 80)");
			s.execute("insert into employee values(149, 'Eleni', 'Zlotkey', 'EZLOTKEY', 11441344429018, TO_DATE('2008-01-29', 'yyyy/mm/dd'), 'SA_MAN', 10500.0, 0.2, 100, 80)");
			s.execute("insert into employee values(150, 'Peter', 'Tucker', 'PTUCKER', 11441344129268, TO_DATE('2005-01-30', 'yyyy/mm/dd'), 'SA_REP', 10000.0, 0.3, 145, 80)");
			
			s.execute("insert into employee values(151, 'David', 'Bernstein', 'DBERNSTE', 11441344345268, TO_DATE('2005-03-24', 'yyyy/mm/dd'), 'SA_REP', 9500.0, 0.25, 145, 80)");
			s.execute("insert into employee values(152, 'Peter', 'Hall', 'PHALL', 11441344478968, TO_DATE('2005-08-20', 'yyyy/mm/dd'), 'SA_REP', 9000.0, 0.25, 145, 80)");
			s.execute("insert into employee values(153, 'Christopher', 'Olsen', 'COLSEN', 11441344498718, TO_DATE('2006-03-30', 'yyyy/mm/dd'), 'SA_REP', 8000.0, 0.2, 145, 80)");
			s.execute("insert into employee values(154, 'Nanette', 'Cambrault', 'NCAMBRAU', 11441344987668, TO_DATE('2006-12-09', 'yyyy/mm/dd'), 'SA_REP', 7500.0, 0.2, 145, 80)");
			s.execute("insert into employee values(155, 'Oliver', 'Tuvault', 'OTUVAULT', 11441344486508, TO_DATE('2007-11-23', 'yyyy/mm/dd'), 'SA_REP', 7000.0, 0.15, 145, 80)");
			s.execute("insert into employee values(156, 'Janette', 'King', 'JKING', 11441345429268, TO_DATE('2004-01-30', 'yyyy/mm/dd'), 'SA_REP', 10000.0, 0.35, 146, 80)");
			s.execute("insert into employee values(157, 'Patrick', 'Sully', 'PSULLY', 11441345929268, TO_DATE('2004-03-04', 'yyyy/mm/dd'), 'SA_REP', 9500.0, 0.35, 146, 80)");
			s.execute("insert into employee values(158, 'Allan', 'McEwen', 'AMCEWEN', 11441345829268, TO_DATE('2004-08-01', 'yyyy/mm/dd'), 'SA_REP', 9000.0, 0.35, 146, 80)");
			s.execute("insert into employee values(159, 'Lindsey', 'Smith', 'LSMITH', 11441345729268, TO_DATE('2005-03-10', 'yyyy/mm/dd'), 'SA_REP', 8000.0, 0.3, 146, 80)");
			s.execute("insert into employee values(160, 'Louise', 'Doran', 'LDORAN', 11441345629268, TO_DATE('2005-12-15', 'yyyy/mm/dd'), 'SA_REP', 7500.0, 0.3, 146, 80)");
			
			s.execute("insert into employee values(161, 'Sarath', 'Sewall', 'SSEWALL', 11441345529268, TO_DATE('2006-11-03', 'yyyy/mm/dd'), 'SA_REP', 7000.0, 0.25, 146, 80)");
			s.execute("insert into employee values(162, 'Clara', 'Vishney', 'CVISHNEY', 11441346129268, TO_DATE('2005-11-11', 'yyyy/mm/dd'), 'SA_REP', 10500.0, 0.25, 147, 80)");
			s.execute("insert into employee values(163, 'Danielle', 'Greene', 'DGREENE', 11441346229268, TO_DATE('2007-03-19', 'yyyy/mm/dd'), 'SA_REP', 9500.0, 0.15, 147, 80)");
			s.execute("insert into employee values(164, 'Mattea', 'Marvins', 'MMARVINS', 11441346329268, TO_DATE('2008-01-24', 'yyyy/mm/dd'), 'SA_REP', 7200.0, 0.1, 147, 80)");
			s.execute("insert into employee values(165, 'David', 'Lee', 'DLEE', 11441346529268, TO_DATE('2008-02-23', 'yyyy/mm/dd'), 'SA_REP', 6800.0, 0.1, 147, 80)");
			s.execute("insert into employee values(166, 'Sundar', 'Ande', 'SANDE', 11441346629268, TO_DATE('2008-03-24', 'yyyy/mm/dd'), 'SA_REP', 6400.0, 0.1, 147, 80)");
			s.execute("insert into employee values(167, 'Amit', 'Banda', 'ABANDA', 11441346729268, TO_DATE('2008-04-21', 'yyyy/mm/dd'), 'SA_REP', 6200.0, 0.1, 147, 80)");
			s.execute("insert into employee values(168, 'Lisa', 'Ozer', 'LOZER', 11441343929268, TO_DATE('2005-03-11', 'yyyy/mm/dd'), 'SA_REP', 11500.0, 0.25, 148, 80)");
			s.execute("insert into employee values(169, 'Harrison', 'Bloom', 'HBLOOM', 11441343829268, TO_DATE('2006-03-23', 'yyyy/mm/dd'), 'SA_REP', 10000.0, 0.2, 148, 80)");
			s.execute("insert into employee values(170, 'Tayler', 'Fox', 'TFOX', 11441343729268, TO_DATE('2006-01-24', 'yyyy/mm/dd'), 'SA_REP', 9600.0, 0.2, 148, 80)");
			
			s.execute("insert into employee values(171, 'William', 'Smith', 'WSMITH', 11441343629268, TO_DATE('2007-02-23', 'yyyy/mm/dd'), 'SA_REP', 7400.0, 0.15, 148, 80)");
			s.execute("insert into employee values(172, 'Elizabeth', 'Bates', 'EBATES', 11441343529268, TO_DATE('2007-03-24', 'yyyy/mm/dd'), 'SA_REP', 7300.0, 0.15, 148, 80)");
			s.execute("insert into employee values(173, 'Sundita', 'Kumar', 'SKUMAR', 11441343329268, TO_DATE('2008-04-21', 'yyyy/mm/dd'), 'SA_REP', 6100.0, 0.1, 148, 80)");
			s.execute("insert into employee values(174, 'Ellen', 'Abel', 'EABEL', 11441644429267, TO_DATE('2004-05-11', 'yyyy/mm/dd'), 'SA_REP', 11000.0, 0.3, 149, 80)");
			s.execute("insert into employee values(175, 'Alyssa', 'Hutton', 'AHUTTON', 11441644429266, TO_DATE('2005-03-19', 'yyyy/mm/dd'), 'SA_REP', 8800.0, 0.25, 149, 80)");
			s.execute("insert into employee values(176, 'Jonathon', 'Taylor', 'JTAYLOR', 11441644429265, TO_DATE('2006-03-24', 'yyyy/mm/dd'), 'SA_REP', 8600.0, 0.2, 149, 80)");
			s.execute("insert into employee values(177, 'Jack', 'Livingston', 'JLIVINGS', 11441644429264, TO_DATE('2006-04-23', 'yyyy/mm/dd'), 'SA_REP', 8400.0, 0.2, 149, 80)");
			s.execute("insert into employee values(178, 'Kimberely', 'Grant', 'KGRANT', 11441644429263, TO_DATE('2007-05-24', 'yyyy/mm/dd'), 'SA_REP', 7000.0, 0.15, 149, 0)");
			s.execute("insert into employee values(179, 'Charles', 'Johnson', 'CJOHNSON', 11441644429262, TO_DATE('2008-01-04', 'yyyy/mm/dd'), 'SA_REP', 6200.0, 0.1, 149, 80)");
			s.execute("insert into employee values(180, 'Winston', 'Taylor', 'WTAYLOR', 6505079876, TO_DATE('2006-01-24', 'yyyy/mm/dd'), 'SH_CLERK', 3200.0, 0.0, 120, 50)");
			
			s.execute("insert into employee values(181, 'Jean', 'Fleaur', 'JFLEAUR', 6505079877, TO_DATE('2006-02-23', 'yyyy/mm/dd'), 'SH_CLERK', 3100.0, 0.0, 120, 50)");
			s.execute("insert into employee values(182, 'Martha', 'Sullivan', 'MSULLIVA', 6505079878, TO_DATE('2007-06-21', 'yyyy/mm/dd'), 'SH_CLERK', 2500.0, 0.0, 120, 50)");
			s.execute("insert into employee values(183, 'Girard', 'Geoni', 'GGEONI', 6505079879, TO_DATE('2008-02-03', 'yyyy/mm/dd'), 'SH_CLERK', 2800.0, 0.0, 120, 50)");
			s.execute("insert into employee values(184, 'Nandita', 'Sarchand', 'NSARCHAN', 6505091876, TO_DATE('2004-01-27', 'yyyy/mm/dd'), 'SH_CLERK', 4200.0, 0.0, 121, 50)");
			s.execute("insert into employee values(185, 'Alexis', 'Bull', 'ABULL', 6505092876, TO_DATE('2005-02-20', 'yyyy/mm/dd'), 'SH_CLERK', 4100.0, 0.0, 121, 50)");
			s.execute("insert into employee values(186, 'Julia', 'Dellinger', 'JDELLING', 6505093876, TO_DATE('2006-06-24', 'yyyy/mm/dd'), 'SH_CLERK', 3400.0, 0.0, 121, 50)");
			s.execute("insert into employee values(187, 'Anthony', 'Cabrio', 'ACABRIO', 6505094876, TO_DATE('2007-02-07', 'yyyy/mm/dd'), 'SH_CLERK', 3000.0, 0.0, 121, 50)");
			s.execute("insert into employee values(188, 'Kelly', 'Chung', 'KCHUNG', 6505051876, TO_DATE('2005-06-14', 'yyyy/mm/dd'), 'SH_CLERK', 3800.0, 0.0, 122, 50)");
			s.execute("insert into employee values(189, 'Jennifer', 'Dilly', 'JDILLY', 6505052876, TO_DATE('2005-08-13', 'yyyy/mm/dd'), 'SH_CLERK', 3600.0, 0.0, 122, 50)");
			s.execute("insert into employee values(190, 'Timothy', 'Gates', 'TGATES', 6505053876, TO_DATE('2006-07-11', 'yyyy/mm/dd'), 'SH_CLERK', 2900.0, 0.0, 122, 50)");
			
			s.execute("insert into employee values(191, 'Randall', 'Perkins', 'RPERKINS', 6505054876, TO_DATE('2007-12-19', 'yyyy/mm/dd'), 'SH_CLERK', 2500.0, 0.0, 122, 50)");
			s.execute("insert into employee values(192, 'Sarah', 'Bell', 'SBELL', 6505011876, TO_DATE('2004-02-04', 'yyyy/mm/dd'), 'SH_CLERK', 4000.0, 0.0, 123, 50)");
			s.execute("insert into employee values(193, 'Britney', 'Everett', 'BEVERETT', 6505012876, TO_DATE('2005-03-03', 'yyyy/mm/dd'), 'SH_CLERK', 3900.0, 0.0, 123, 50)");
			s.execute("insert into employee values(194, 'Samuel', 'McCain', 'SMCCAIN', 6505013876, TO_DATE('2006-07-01', 'yyyy/mm/dd'), 'SH_CLERK', 3200.0, 0.0, 123, 50)");
			s.execute("insert into employee values(195, 'Vance', 'Jones', 'VJONES', 6505014876, TO_DATE('2007-03-17', 'yyyy/mm/dd'), 'SH_CLERK', 2800.0, 0.0, 123, 50)");
			s.execute("insert into employee values(196, 'Alana', 'Walsh', 'AWALSH', 6505079811, TO_DATE('2006-04-24', 'yyyy/mm/dd'), 'SH_CLERK', 3100.0, 0.0, 124, 50)");
			s.execute("insert into employee values(197, 'Kevin', 'Feeney', 'KFEENEY', 6505079822, TO_DATE('2006-05-23', 'yyyy/mm/dd'), 'SH_CLERK', 3000.0, 0.0, 124, 50)");
			s.execute("insert into employee values(198, 'Donald', 'OConnell', 'DOCONNEL', 6505079833, TO_DATE('2007-06-21', 'yyyy/mm/dd'), 'SH_CLERK', 2600.0, 0.0, 124, 50)");
			s.execute("insert into employee values(199, 'Douglas', 'Grant', 'DGRANT', 6505079844, TO_DATE('2008-01-13', 'yyyy/mm/dd'), 'SH_CLERK', 2600.0, 0.0, 124, 50)");
			s.execute("insert into employee values(200, 'Jennifer', 'Whalen', 'JWHALEN', 5151234444, TO_DATE('2003-09-17', 'yyyy/mm/dd'), 'AD_ASST', 4400.0, 0.0, 101, 10)");
			
			s.execute("insert into employee values(201, 'Michael', 'Hartstein', 'MHARTSTE', 5151235555, TO_DATE('2004-02-17', 'yyyy/mm/dd'), 'MK_MAN', 13000.0, 0.0, 100, 20)");
			s.execute("insert into employee values(202, 'Pat', 'Fay', 'PFAY', 6031236666, TO_DATE('2005-08-17', 'yyyy/mm/dd'), 'MK_REP', 6000.0, 0.0, 201, 20)");
			s.execute("insert into employee values(203, 'Susan', 'Mavris', 'SMAVRIS', 5151237777, TO_DATE('2002-06-07', 'yyyy/mm/dd'), 'HR_REP', 6500.0, 0.0, 101, 40)");
			s.execute("insert into employee values(204, 'Hermann', 'Baer', 'HBAER', 5151238888, TO_DATE('2002-06-07', 'yyyy/mm/dd'), 'PR_REP', 10000.0, 0.0, 101, 70)");
			s.execute("insert into employee values(205, 'Shelley', 'Higgins', 'SHIGGINS', 5151238080, TO_DATE('2002-06-07', 'yyyy/mm/dd'), 'AC_MGR', 12008.0, 0.0, 101, 110)");
			s.execute("insert into employee values(206, 'William', 'Gietz', 'WGIETZ', 5151238181, TO_DATE('2002-06-07', 'yyyy/mm/dd'), 'AC_ACCOUNT', 8300.0, 0.0, 205, 110)");
			
			
			System.out.println("Table created");
	    }
	    
	    
	    // Structure of department table
	    System.out.println("\nStructure of employee table:-");
	    String select_query = "Select EMPLOYEE_ID, LAST_NAME, JOB_ID, HIRE_DATE AS STARTDATE from employee";
	    System.out.format("%-20s%-20s%-20s%-20s", "EMPlOYEE_ID", "LAST_NAME", "JOB_ID", "STARTDATE");
	    System.out.println();
	    ResultSet rs = s.executeQuery(select_query);
		
//		System.out.println("\nData of employee table:-");
	    int n = 0;
		while(rs.next())
		{
			System.out.format("%-20s%-20s%-20s%-20s", rs.getInt(1)+"", rs.getString(2), rs.getString(3), rs.getDate(4)+"");
			System.out.println();
			n++;
		}
		System.out.println(n);
	    con.close();
	}
}

/*
 * l = "110 | John        | Chen        | JCHEN    | 515.124.4269       | 2005-09-28 | FI_ACCOUNT |  8200.00 |           0.00 |        108 |           100"
li = l.split('|')
print(li)

ans = []
ans.append(int(li[0].strip()))
ans.append(li[1].strip())
ans.append(li[2].strip())
ans.append(li[3].strip())
ans.append(int(li[4].strip().replace('.','')))
ans.append('TO_DATE(\'' + li[5].strip() + '\', \'yyyy/mm/dd\')')
ans.append(li[6].strip())
ans.append(float(li[7].strip()))
ans.append(float(li[8].strip()))
ans.append(int(li[9].strip()))
ans.append(int(li[10].strip()))
print(ans)
 */
