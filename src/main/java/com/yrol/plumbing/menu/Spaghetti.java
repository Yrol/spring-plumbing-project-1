package com.yrol.plumbing.menu;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * This will be the primary class of all IFood implementations.
 * When injecting IFood interface into constructions, this class will be chosen.
 * */
@Primary
@Repository
public class Spaghetti implements IFood {
}
