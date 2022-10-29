---
layout: page
title: Phylicia Christel's Project Portfolio Page
---

### Project: Pupilist

#### Overview
Pupilist is a desktop address book application used for private tutors to handle and organise a student's info, easing their workload. The user interacts with it using a CLI, and it has a GUI created with JavaFX. It is written in Java.

#### Summary of Contrbutions

* **Code contributed**: [tP Code Dashboard](https://nus-cs2103-ay2223s1.github.io/tp-dashboard/?search=phyliciachristel&breakdown=true&sort=groupTitle&sortWithin=title&since=2022-09-16&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other)

* **Enhancements implemented**:
  * Added the lesson plan feature and tests (Pull requests [\#47](https://github.com/AY2223S1-CS2103T-W09-4/tp/pull/47), [\#48](https://github.com/AY2223S1-CS2103T-W09-4/tp/issues/48))
    * Updated `AddCommand` and `AddCommandParser` to include `LessonPlan`
    * Created `LessonPlanCommand` and `LessonPlanCommandParser` and the respective tests
  * Added the schedule feature (Pull requests [\#76](https://github.com/AY2223S1-CS2103T-W09-4/tp/pull/76), [\#103](https://github.com/AY2223S1-CS2103T-W09-4/tp/pull/103), [\#118](https://github.com/AY2223S1-CS2103T-W09-4/tp/pull/118))
    * Creation of the `TimeSlot` class
    * Integration of `ShowCommand` with `Model` to retrieve time slots
    * Creation of new UI classes, `TimeSlotListPanel` and `TimeSlotCard` and integration with current display
    * Updated current Command classes and added tests to improve defensiveness (Pull request [\#118](https://github.com/AY2223S1-CS2103T-W09-4/tp/pull/118))
    * Had to thoroughly consider the different methods to access the timings and how to allow it to be displayed
  * Remove case-sensitiveness of inputs (Pull request [\#65](https://github.com/AY2223S1-CS2103T-W09-4/tp/pull/65))

* **Contributions to the UG**:
  * Update pre-existing commands to match current features
  * Added `view` command
  * Added `lesson` command
  * Added `show` command
  * Update commands to specify the mode that they can be executed in

* **Contributions to the DG**:
  * Updated glossary and use cases
  * Added lesson plan feature (Pull request [\#97](https://github.com/AY2223S1-CS2103T-W09-4/tp/pull/97))
  * Added schedule feature and fixed layout issues (Pull request [\#130](https://github.com/AY2223S1-CS2103T-W09-4/tp/pull/130))
  * Update pre-existing diagrams to include new features (Pull request [\#130](https://github.com/AY2223S1-CS2103T-W09-4/tp/pull/130))
    * BetterModelClassDiagram, ModelClassDiagram, StorageClassDiagram, UiClassDiagram, DeleteSequenceDiagram

* **Contributions to team-based tasks**:
  * Updated the [AboutUs](https://ay2223s1-cs2103t-w09-4.github.io/tp/AboutUs.html) page 
  * Enabled assertions for team code (Pull request [\#77](https://github.com/AY2223S1-CS2103T-W09-4/tp/pull/77))

* **Review/mentoring contributions**:
  * PR reviews (non-trivial comments): _{to be added}_
  * PR reviews: _{to be added}_

* **Contributions beyond the project team**: to be added soon
