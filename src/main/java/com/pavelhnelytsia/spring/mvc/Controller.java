/**
 * %W% %E% Pavel Hnelytsia
 * <p>
 * Copyright (c) 1996-2022 Sun Microsystems, Inc. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Sun
 * Microsystems, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sun.
 * <p>
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */

package com.pavelhnelytsia.spring.mvc;


import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The class Controller gives certain View for certain URL
 *
 * @author Pavel Hnelytsia
 * @version 1.0
 * @since 01.11.2022
 */

@org.springframework.stereotype.Controller
public class Controller {


    /**
     * Method showTestView for URL ending like '/' give jsp/html file
     * <br>File should be in "/WEB-INF/view/" package and have .jsp format
     * <br> The description in applicationContext.xml must be followed.
     *
     * @return test_view
     */

    @RequestMapping("/")
    public String showTestView() {
        return "test_view";
    }
}
