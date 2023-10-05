import { WebPlugin } from '@capacitor/core';

import type { ContextMenuPlugin } from './definitions';

export class ContextMenuWeb extends WebPlugin implements ContextMenuPlugin {
  async checkProcessTextIntentReceived(): Promise<{ text: string }> {
    return { text: '' }; 
  }
}
