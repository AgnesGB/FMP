# FMP
just testing a creature creation system in an rpg world

# Essence Creator
This repository contains a tool for creating essences, allowing for the configuration of creatures with specific attributes and limitations.

# Features
You can create a new essence using the CreateEssence class. Here’s an example of how to use it:
- CreateEssence test = new CreateEssence(...);

# Parameters
When instantiating a new essence, you need to pass the following parameters:
- Name: The name of the essence.
- ID: A unique identifier for the essence.
- Age: The age of the essence.
- Magical Affinity: The essence's affinity for magic.
- Race: Determines the amount of health, mana, and certain effects.
- Additionally, boolean parameters will define the type of essence, based on the EssenceType, which categorizes the essence being created.

# Types of Essences and Limitations
- Mortals: can have up to 10 attribute points.
- Servants: can have up to 15 attribute points.
- Etc.: Additional types are available in the code.
- The type of essence defines the total amount of essence the creature has, as well as granting extra attributes. For example, servants have a divine patron that grants them blessings, increasing their total essence(not yet implemented).

# Relationship with Deities
I am working on a mechanism to relate servants to the deities they serve. This will require a repository to check for the existence of the deity, allowing for additional parameters to be passed and blessings to be configured.

# Current Implementation
Currently, the implementation covers the creation of the essence of a living creature. After creating the essence, it is possible to set the attributes using the verifyAttributes class. Additionally, you can ascend(.ascend) this essence to give it a new essence type status, allowing for the redefinition of attributes. In the future, I plan to expand this to allow for the creation of essences for objects and other types of entities.

# Next Steps
- Implement the repository for deities.
- Add support for creating essences for objects.
- Refine the attribute limit system based on essence types.
- Give some additional attributes related to the race.
