# P2VRT - Pattern-Driven Verication Process Tool

P2VRT is a guidance tool aimed at helping desigers through the verification phase of their systems in order to meet real-time requirements. Real-Time verification design patterns are the focus of this tool. Currently, [more than 25 design patterns are available](https://github.com/Rania-Mzid/P2VRT/tree/main/Patterns%20repositery).

## Required Tools

You must install these tools to be able to use the proposed tool:

- Eclipse IDE: https://www.eclipse.org/downloads/
- Papyrus: Launch Eclipse and navigate to Window -> Open Perspective -> Other, select Papyrus and press OK.
- Acceleo: Launch Eclipse and navigate to Window -> Open Perspective -> Other, select Acceleo and press OK.

- Mast: https://mast.unican.es
- Cheddar: http://beru.univ-brest.fr/cheddar/
- SimSo: https://github.com/MaximeCheramy/simso

The source code can also be found on GitHub: https://github.com/Rania-Mzid/P2VRT/tree/main/P2VRT%20Tool.

## Before Starting 

The designer must create a component model that describes his/her application (e.g. cruise_control) and defines the software and hardware of his/her system as two sub_components of the initial component created (e.g. Sw_Architecture and Hw-Architecture).

In the component model:
- Each Software resource (Task or Resource) is defined as a component within the software architecture component.
- When Task components are dependent (access/data exchange/synchronization) a connector is created between them.
- Each hardware resource (Processor or Network) is defined as a component in the hardware architecture component.

An example of an architecture model for the cruise control application is provided in the case study repository: https://github.com/Rania-Mzid/P2VRT/tree/main/Case%20study%20and%20demos.


## Steps To Follow

1- 
