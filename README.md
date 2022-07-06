# P2VRT - Pattern-Driven Verication Process Tool

P2VRT is a guidance tool aimed at helping desigers through the verification phase of their systems in order to meet real-time requirements. Real-Time verification design patterns are the focus of this tool. Currently, [more than 20 design patterns are available](https://github.com/Rania-Mzid/P2VRT/tree/main/Patterns%20repositery).

## Required Tools

You must install these tools to be able to use the proposed tool:

- Eclipse IDE: https://www.eclipse.org/downloads/
- Papyrus: Launch Eclipse and navigate to Window -> Open Perspective -> Other, select Papyrus and press OK.
- Acceleo: Launch Eclipse and navigate to Window -> Open Perspective -> Other, select Acceleo and press OK.

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

### Step 1 - Get a design pattern

1. Import the architecture model into the application interface, then select the model to apply by first selecting the real-time metric to be evaluated, then answering a series of questions that aim to guide him/her to the applicable patterns.
2. Apply the chosen pattern to his/her architectural model to obtain the design model.

**NOTES**
A new project folder named "ProjectFolderName_PatternName" will be added in the designer workspace folder with the profile of the chosen pattern.
The designer must import the new project folder in order to use it in all subsequent steps.

### Step 2 - Consistency check

1. Create a new Acceleo project.
2. Copy the code of the downloaded file named "transTo_Consistensy" in the created Acceleo project and run it.
3. Run the result file named "verif_Consistensy" of this transformation with a Java compilater to be able to answer the following question.

### Step 3 - Schedulability check

1. Create a new Acceleo Project.
2. Copy the code of the downloaded file named "transTo_ChosenToolName" in the created Acceleo project and run it.
3. Analyze the result file named "analysis_Model" of this transformation with the choosen tool to be able to answer the following question.

### Step 4 - Get a POSIX code

1. Create a new Acceleo Project.
2. Copy the code of the downloaded file named "transTo_Posix" in the created Acceleo project and run it.
3. Run the result file named "Posix_Code" of this transformation with the chosen tool to be able to answer the following question.

### Location of the files to be downloaded and generated

- The "transTo_Consistensy", "transTo_ChosenToolName" and "transTo_Posix" files will be found in a folder named "trans_models" under his/her new project folder.
- The "verif_Consistensy", "analysis_Model" and "Posix_Code" files will be found in a folder named "src_gen" under his/her new project folder.
