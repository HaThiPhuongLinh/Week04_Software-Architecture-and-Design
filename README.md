# Visualizing distance from the main sequence and other Clean Architecture metrics in Java
## Introduction
This project utilizes the `jdepend` library to analyze and visualize Java project metrics, focusing on the distance from the main sequence in Clean Architecture.
## Main of Sequence
![image](https://github.com/HaThiPhuongLinh/Week04_Software-Architecture-and-Design/assets/109422010/f7e29bfe-1ba6-45d1-990e-1202e9af146b)

`D = | A + I - 1|` 

*(A = abstractness and I = instability)*

![image](https://github.com/HaThiPhuongLinh/Week04_Software-Architecture-and-Design/assets/109422010/163823bf-e74a-4053-8d8d-7d559610407e)

The closer to the line, the better balanced the class.
 - Classes that fall too far into the upper righthand corner enter into what architects call the zone of uselessness: code that is too abstract becomes difficult to use.
 - Conversely, code that falls into the lower lefthand corner enter the zone of pain: code with too much implementation and not enough abstraction becomes brittle and hard to maintain.

## Usage
- Write code to export the project report to XML.
- View Java packages using the UI provided by jdepend.
- Install JDepend-UI from its GitHub repository.
- Generate the final report using JDepend-UI.
  
## Setup
1. Download `jdepend-2.10.zip` from the official GitHub repository and extract it to a desired directory. (https://github.com/clarkware/jdepend/tree/master/dist)
2. Create a new project and add a `libs` directory in the root of the project.
3. In `build.gradle`, include the dependency:
   
   ```js
   implementation fileTree(dir: 'libs', include: ['*.jar'])
   ```
   
## Installation
Install `JDepend-UI`, which requires `nodejs` to be installed. (https://github.com/ValentinaServile/jdepend-ui)
## Generating Reports
Use the `JDepend-UI` to generate a report by running:
`npm run jdepend-ui <path-to-xml-report-file> <your-packages-prefix>`

If everything went okay, now we have an index.html file in working directory.

If you open it with a web browser, you should see something like:

![image](https://github.com/HaThiPhuongLinh/Week04_Software-Architecture-and-Design/assets/109422010/fad89ace-da22-4d0f-9f3c-8a52304f3840)

