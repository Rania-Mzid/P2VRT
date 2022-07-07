# P2VRT - Pattern-Driven Verication Process Tool

P2VRT is a guidance tool aimed at helping desigers through the verification phase of their systems in order to meet real-time requirements. Real-Time verification design patterns are the focus of this tool. Currently, [more than 20 design patterns are available](https://github.com/Rania-Mzid/P2VRT/tree/main/Patterns%20repository).

## Required Tools

You must install these tools to be able to use the proposed tool:

- Eclipse IDE: https://www.eclipse.org/downloads/
- Acceleo: Open Eclipse IDE => Go to Help => Install New Software => add the following URL : http://download.eclipse.org/acceleo/updates/releases/3.7 => Select the items in the combo box => Click Finish.
- Papyrus: Same steps as Acceleo. URL to be used : https://download.eclipse.org/modeling/mdt/papyrus/updates/releases/2022-06.
- Mast: https://mast.unican.es
- Cheddar: http://beru.univ-brest.fr/cheddar/
- SimSo: https://github.com/MaximeCheramy/simso

P2VRT source code can be found in the [P2VRT Tool](https://github.com/Rania-Mzid/P2VRT/tree/main/P2VRT%20Tool) repository.

## Before Starting 

The designer must create a component model that describes his/her application (e.g. cruise_control) and defines the software and hardware of his/her system as two sub_components of the initial component created (e.g. Sw_Architecture and Hw-Architecture).

In the component model:
- Each Software resource (Task or Resource) is defined as a component within the software architecture component.
- When Task components are dependent (access/data exchange/synchronization) a connector is created between them.
- Each hardware resource (Processor or Network) is defined as a component in the hardware architecture component.

An example of an architecture model for the cruise control application is provided in the [Case Study](https://github.com/Rania-Mzid/P2VRT/tree/main/Case%20study%20and%20demos) repository.


## Steps To Follow

### Step 1 - Design Pattern Selection

1. Import the architecture model into the application interface, then select the model to apply by first selecting the real-time metric to be evaluated, then answering a series of questions that aim to guide him/her to the applicable patterns.
2. Apply the chosen pattern to his/her architectural model to obtain the design model.

> **_NOTE:_**
> A new project folder named "ProjectFolderName_PatternName" will be added in the designer's workspace folder with the chosen pattern profile, and he/she needs to import it into Eclipse in order to use it in all the following steps.

### Step 2 - Consistency Check

1. Create a new Acceleo project.
2. Copy the code of the downloaded file named "PatternName_transToAnalysisToolName" in the "generate.mtl" file of the Acceleo project and run it.
3. Run the result file named "PatternName_verifConsistensy" of this transformation with a Java compilater to be able to answer the following question.

> **_NOTE:_**
> A folder named "gen-src" will be added in the new project folder, the designer must select this folder when generating the files with Acceleo.\nThe designer can use the same Acceleo project created in all the following steps.

### Step 3 - Schedulability Check

1. Open the created Acceleo project.
2. Copy the code of the downloaded file named "PatternName_transToAnalysisToolName" in the "generate.mtl" file of the Acceleo project and run it.
4. Analyze the result file named "PatternName_AnalysisToolName" of this transformation with the choosen tool to be able to answer the following question.

> **_NOTE:_**
> If the designer chooses to estimate the processor utilization factor, the file in (2.) will be named "PatternName_transToPU" and the file in (3.) will be named "PatternName_estimatePU" which will be run with a Java compiler.

### Step 4 - POSIX Code Generation

1. Open the created Acceleo project.
2. Copy the code of the downloaded file named "PatternName_transToPosix" in the "generate.mtl" file of the Acceleo project and run it.
3. Run the result file named "PatternName_Posix" of this transformation with the chosen tool to be able to answer the following question.

### Location of the files to be downloaded

The "PatternName_transToConsistency", "PatternName_transToAnalysisToolName", "PatternName_transToPU" and "PatternName_transToPosix" files will be found in a folder named "trans_models" under his/her new project folder.
