/**
 * Copyright Aisino. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bcia.julongchain.common.policycheck.policies;

import org.bcia.julongchain.common.exception.PolicyException;
import org.bcia.julongchain.common.util.proto.SignedData;

import java.util.List;

/**
 * 类描述
 *  策略评估接口
 * @author yuanjun
 * @date 31/05/18
 * @company Aisino
 */
public interface IEvalutor {
    /**
     * CAuthdsl类中的compile方法的返回函数
     * @param signedDatas
     * @param bool
     * @return
     * @throws PolicyException
     */
    boolean evaluate(List<SignedData> signedDatas,Boolean[] bool) throws PolicyException;

}
