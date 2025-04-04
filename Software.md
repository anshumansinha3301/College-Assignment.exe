# Module III: Coding

## 1. Programming Practices
- Emphasizes code readability, efficiency, and maintainability.
- Key practices include:
  - Use of meaningful variable and function names.
  - Proper indentation and code structure.
  - Commenting and documentation.
  - Error and exception handling.
  - Consistent coding style.
  - Version control (e.g., Git).

## 2. Top-Down Approach
- Starts from the overall system design.
- Breaks down the system into smaller sub-systems or modules.
- Focuses on the **overall structure first**, then implementation.
- Advantages:
  - Better planning and organization.
  - Suitable for large projects.

## 3. Bottom-Up Approach
- Begins with developing individual modules or components.
- These components are integrated into a larger system.
- Focuses on **code reuse and modular development**.
- Advantages:
  - Early testing of individual parts.
  - Encourages reuse of existing components.

## 4. Structured Programming
- Programming paradigm based on:
  - Sequence
  - Selection (if-else)
  - Iteration (loops)
- Encourages modular and readable code.
- Avoids unstructured constructs like `goto`.

## 5. Information Hiding
- Conceals internal details of a module or class from the outside world.
- Promotes:
  - Abstraction
  - Encapsulation
  - Modularity
- Example: Using private variables and providing access through public methods.

## 6. Paired Programming
- Agile development technique.
- Two developers work at one workstation:
  - **Driver**: Writes the code.
  - **Observer/Navigator**: Reviews the code, suggests improvements.
- Benefits:
  - Higher code quality.
  - Improved collaboration.
  - Knowledge sharing.

---

# Module IV: Software Design

## 1. Software Design Process
- Stages:
  1. Requirements Analysis
  2. Architectural Design
  3. Component Design
  4. Interface Design
- Outputs: System architecture, module diagrams, and interface specifications.

## 2. Design Objectives
- Correctness
- Simplicity
- Flexibility
- Efficiency
- Maintainability
- Modularity
- Reusability

## 3. Structured Design Methodologies
- Breaks a system into smaller, manageable parts.
- Common methodologies:
  - Data Flow-Oriented Design (e.g., DFDs)
  - Object-Oriented Design
  - Jackson Structured Programming (JSP)

## 4. Modules: Coupling and Cohesion

### 4.1 Coupling
- Degree of interdependence between modules.
- Types (from worst to best):
  - **Content Coupling**: One module modifies another directly.
  - **Common Coupling**: Shared global data.
  - **Control Coupling**: One module controls another’s logic.
  - **Stamp Coupling**: Passes data structures.
  - **Data Coupling**: Passes only required data.

### 4.2 Cohesion
- Degree to which elements within a module belong together.
- Types (from worst to best):
  - **Coincidental**: Randomly grouped code.
  - **Logical**: Similar operations grouped.
  - **Temporal**: Related by time.
  - **Procedural**: Related by control flow.
  - **Communicational**: Operate on same data.
  - **Sequential**: Output from one part is input to another.
  - **Functional**: Single, focused task.

## 5. Structured Charts
- Graphical representation of system architecture.
- Illustrates hierarchical relationships between modules.
- Helps in understanding data and control flow.

## 6. Qualities of Good Software Design
- **Modularity**: Separation into independent modules.
- **Simplicity**: Easy to understand and maintain.
- **Correctness**: Matches specifications.
- **Flexibility**: Easy to adapt to changes.
- **Efficiency**: Optimized resource use.
- **Reusability**: Components usable in other systems.

---

# Module V: Software Testing

## 1. Introduction to Software Testing
- Process to evaluate software functionality and quality.
- Identifies bugs and ensures requirement compliance.
- Testing can be manual or automated.

## 2. Levels of Testing
- **Unit Testing**: Tests individual components/modules.
- **Integration Testing**: Tests combined components.
- **System Testing**: Tests the complete system.
- **Acceptance Testing**: Validates system with user requirements.

## 3. Characteristics of Software Testing
- Planned and systematic.
- Detects defects early.
- Verifiable and repeatable.
- Independent of development process.
- Ensures software quality and reliability.

## 4. Black-Box Testing
- Tester does not know internal logic or code.
- Focuses on input-output behavior.
- Techniques include:
  - Equivalence Partitioning
  - Boundary Value Analysis
  - Cause-Effect Graphing

## 5. White-Box Testing
- Tester knows the internal structure and logic.
- Focuses on paths, conditions, and loops.
- Techniques include:
  - Statement Coverage
  - Branch Coverage
  - Path Coverage
  - Loop Testing

## 6. Alpha, Beta, and Gamma Testing

### Alpha Testing
- Conducted by internal developers or testers.
- Simulated or real user environment.
- Early stage of acceptance testing.

### Beta Testing
- Conducted by real users outside the organization.
- In real user environments.
- Identifies real-world issues.

### Gamma Testing
- Final stage of testing before release.
- No changes to features allowed.
- Only minor bug fixes permitted.
- Ensures software is release-ready.

---
